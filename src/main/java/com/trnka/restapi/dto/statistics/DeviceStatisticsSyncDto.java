package com.trnka.restapi.dto.statistics;

import lombok.Data;

import java.util.List;

@Data
public class DeviceStatisticsSyncDto {
    List<StudentDeviceStatisticsDto> statistics;
}
