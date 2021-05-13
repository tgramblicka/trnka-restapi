package com.trnka.restapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SyncConfigDto {
    private Boolean enableDownloadFromServerToDevice;
    private Boolean enableUploadFromDeviceToServer;
}
