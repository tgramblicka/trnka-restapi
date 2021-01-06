package com.trnka.restapi.dto.statistics;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class ExaminationStatisticDto {
    private Long examinationId; // references examination on VST
    private LocalDateTime finishedOn;
    private String letterSequence;
    private Long totalTimeInMs;
    private Boolean passed;
    private List<ExaminationStepStatisticDto> stepStatistics;
}
