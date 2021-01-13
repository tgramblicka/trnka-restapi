package com.trnka.restapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ExaminationDto extends BaseDto {
    private String name;
    private String audio;
    private Long timeout;
    private Long complexity;
    private SequenceType type;
    private Integer allowedRetries;
    private List<ExaminationStepDto> steps;

}
