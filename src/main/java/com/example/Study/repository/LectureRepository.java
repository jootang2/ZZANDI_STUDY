package com.example.Study.repository;

import com.example.Study.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LectureRepository extends JpaRepository<Lecture, Integer> {
    Optional<Lecture> findById(Long id);
}
