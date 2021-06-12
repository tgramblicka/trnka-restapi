package com.trnka.restapi.dto.statistics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DeviceStatisticsSyncDto {
    private String deviceId;
    private List<StudentDeviceStatisticsDto> statistics = new ArrayList<>();
}
