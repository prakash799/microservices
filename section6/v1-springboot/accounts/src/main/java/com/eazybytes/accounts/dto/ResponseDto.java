package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "Response",
        description = "Schema to hold successfully response information"
)
public record ResponseDto(
        @Schema(description = "Status code in the response", example = "200")
        String statusCode,
        @Schema(description = "Status message in the response", example = "Request processed successfully")
        String statusMessage) {
}
