package com.example.Study.controller;

import javax.validation.Valid;

import com.example.Study.exception.StudyForm;
import org.springframework.validation.BindingResult;
import com.example.Study.domain.Study;
import com.example.Study.dto.StudyDto;
import com.example.Study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudyController {

    private final StudyService studyService;

    @GetMapping("/study/create")
    public String studyCreate(StudyForm studyForm) {
        return "studyForm";
    }

    @PostMapping("/study/create")
    public String studyCreate(@Valid StudyForm studyForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "studyForm";
        }

        studyService.save(studyForm);
        return "redirect:/";
    }

    @GetMapping("/study/list")
    public String list(Model model) {
        List<Study> studyList = studyService.findall();
        model.addAttribute("studyList", studyList);
        return "studyList";
    }

    @GetMapping("/study/detail/{studyId}")
    public String detail(Model model, @PathVariable Long studyId) {
        Study studies = studyService.findByid(studyId).get();
        model.addAttribute("studies", studies);
        return "studyDetail";
    }

    @GetMapping("/study/delete/{studyId}")
    public String delete(@PathVariable Long studyId) {
        Study studies = studyService.findByid(studyId).get();
        studyService.delete(studies);
        return "redirect:/";
    }

    @GetMapping("/study/modify/{studyId}")
    public String modify(StudyForm studyForm) {

        return "studyModify";
    }

    @PostMapping("/study/modify/{studyId}")
    public String modify(@Valid StudyForm studyForm, BindingResult bindingResult, @PathVariable Long studyId) {
        if (bindingResult.hasErrors()) {
            return "studyModify";
        }
        studyService.modify(studyId, studyForm);
        return "redirect:/";
    }

}