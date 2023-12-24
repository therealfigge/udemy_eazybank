package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "AccountNumber of Eazy Bank account"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be null or empty")
    @Schema(
            description = "AccountType of Eazy Bank Account",
            example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "Eazy Bank BranchAddress"
    )
    private String branchAddress;
}
