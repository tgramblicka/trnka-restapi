package com.trnka.restapi.dto;

import lombok.Data;

@Data
public class ExaminationStepDto extends BaseDto {

    private BrailCharacterDto brailCharacter;
    private Boolean preserveOrder;
}
