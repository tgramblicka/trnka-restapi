package com.trnka.restapi.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO extends BaseDto {
    private String userName;
    private String code;
    private Set<Long> examinationIds;
}
