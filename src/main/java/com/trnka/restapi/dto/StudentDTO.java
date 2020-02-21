package com.trnka.restapi.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO extends BaseDto {
    private String userName;
    private String code;
    private List<ExaminationDto> examinations;
}
