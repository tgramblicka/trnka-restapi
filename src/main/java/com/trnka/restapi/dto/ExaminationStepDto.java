package com.trnka.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExaminationStepDto extends BaseDto {

    private BrailCharacterDto brailCharacter;
    private Boolean preserveOrder;
}
