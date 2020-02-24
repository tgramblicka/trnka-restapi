package com.trnka.restapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class SyncDto {
    private List<StudentDTO> students;

}
