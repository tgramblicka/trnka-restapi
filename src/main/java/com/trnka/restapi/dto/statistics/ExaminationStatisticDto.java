package com.trnka.restapi.dto.statistics;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.trnka.restapi.dto.Constants;
import com.trnka.restapi.dto.SequenceType;

import lombok.Data;

@Data
public class ExaminationStatisticDto {
    private Long examinationId; // references examination on VST
    private SequenceType sequenceType;

    @JsonFormat(pattern = Constants.API_DATE_FORMAT)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime finishedOn;
    private String letterSequence;
    private Long totalTimeInMs;
    private Boolean passed;
    private List<ExaminationStepStatisticDto> stepStatistics;
}
