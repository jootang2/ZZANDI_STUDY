package com.example.Study.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudyDto {
    private Long id;
    private String studyTitle;
    private String studyStart;
    private String studyEnd;
    private int studyPeople;
    private String studyTag;
    private String studyType;
    private int studyRate;
    private String studyStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public void setStudyTitle(String studyTitle) {
        this.studyTitle = studyTitle;
    }

    public String getStudyStart() {
        return studyStart;
    }

    public void setStudyStart(String studyStart) {
        this.studyStart = studyStart;
    }

    public String getStudyEnd() {
        return studyEnd;
    }

    public void setStudyEnd(String studyEnd) {
        this.studyEnd = studyEnd;
    }

    public int getStudyPeople() {
        return studyPeople;
    }

    public void setStudyPeople(int studyPeople) {
        this.studyPeople = studyPeople;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public void setStudyTag(String studyTag) {
        this.studyTag = studyTag;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public int getStudyRate() {
        return studyRate;
    }

    public void setStudyRate(int studyRate) {
        this.studyRate = studyRate;
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }
}
