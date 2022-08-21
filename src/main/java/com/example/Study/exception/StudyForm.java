package com.example.Study.exception;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudyForm {
    @NotEmpty(message = "스터디명은 필수항목입니다.")
    @Size(max = 200)
    private String studyTitle;

    @NotEmpty(message = "스터디 시작일은 필수항목입니다.")
    private String studyStart;

    @NotEmpty(message = "스터디 종료일은 필수항목입니다.")
    private String studyEnd;

    @NotNull(message = "스터디 인원 수는 필수항목입니다.")
    private Integer studyPeople;

    @NotNull(message = "스터디 태그는 필수항목입니다.")
    private String studyTag;

    @NotNull(message = "스터디 타입은 필수항목입니다.")
    private String studyType;
}
