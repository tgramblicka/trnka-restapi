package com.trnka.restapi.dto.statistics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentDeviceStatisticsDto {
    private String studentCode;
    private Integer loginCount;
    private List<ExaminationStatisticDto> statistics = new ArrayList<>();
}
