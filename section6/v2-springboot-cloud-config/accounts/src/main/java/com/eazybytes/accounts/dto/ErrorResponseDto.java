package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold ErrorResponse information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by Customer"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error that occured"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error that occured"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error that occured"
    )
    private LocalDateTime errorTime;
}
