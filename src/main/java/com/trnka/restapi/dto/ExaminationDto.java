package com.trnka.restapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExaminationDto extends BaseDto {
    private String name;
    private String audio;
    private Long timeout;
    private Long complexity;
    private ExaminationType type;
    private Integer allowedRetries;

}
