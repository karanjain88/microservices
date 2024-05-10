package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema (
        name = "Response",
        description = "Schema to hold successful account information"
)
public class ResponseDto {

    @Schema (
            description = "Status code in a response"
    )
    private String statusCode;

    @Schema (
            description = "Status message in a response"
    )
    private String statusMsg;
}
