package com.trnka.restapi.dto.statistics;

import lombok.Data;

@Data
public class ExaminationStepStatisticDto {
    private Long examinationStepId; // references ExaminationStep on VST
    private String letter;
    private Long durationInMs;
    private Integer retries;
    private Boolean correct;
    private Integer displayOrder;
}
