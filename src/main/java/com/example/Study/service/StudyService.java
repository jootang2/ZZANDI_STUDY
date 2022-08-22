package com.example.Study.service;

import com.example.Study.domain.Book;
import com.example.Study.domain.Study;
import com.example.Study.dto.BookDto;
import com.example.Study.dto.StudyDto;
import com.example.Study.exception.StudyForm;
import com.example.Study.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Service
public class StudyService {

    private final StudyRepository studyRepository;

    @Autowired
    public StudyService(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public void save(@Valid StudyForm studyform) {
        Study s1 = new Study();

        s1.setStudyTitle(studyform.getStudyTitle());
        s1.setStudyStart(studyform.getStudyStart());
        s1.setStudyEnd(studyform.getStudyEnd());
        s1.setStudyPeople(studyform.getStudyPeople());
        s1.setStudyTag(studyform.getStudyTag());
        s1.setStudyType(studyform.getStudyType());
        studyRepository.save(s1);
    }

    public List<Study> findall() {
        return studyRepository.findAll();
    }


    public Optional<Study> findByid(Long studyId) {
        return studyRepository.findById(studyId);
    }

    public void delete(Study studies) {
        studyRepository.delete(studies);
    }

    public void modify(Long studyId, @Valid StudyForm studyform) {
        Study s1 = new Study();
        s1.setId(studyId);
        s1.setStudyTitle(studyform.getStudyTitle());
        s1.setStudyStart(studyform.getStudyStart());
        s1.setStudyEnd(studyform.getStudyEnd());
        s1.setStudyPeople(studyform.getStudyPeople());
        s1.setStudyTag(studyform.getStudyTag());
        s1.setStudyType(studyform.getStudyType());
        studyRepository.save(s1);
    }
}
