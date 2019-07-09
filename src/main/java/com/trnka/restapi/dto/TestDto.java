package com.trnka.restapi.dto;

public class TestDto {

    private Long studentId;
    private Long testId;
    private TestContentDto content;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(final Long studentId) {
        this.studentId = studentId;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(final Long testId) {
        this.testId = testId;
    }

    public TestContentDto getContent() {
        return content;
    }

    public void setContent(final TestContentDto content) {
        this.content = content;
    }
}
