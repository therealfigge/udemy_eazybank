package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold Loans information"
)
@Data
public class LoansDto {

    @NotEmpty(message = "MobileNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "MobileNumber must be 10 digits")
    @Schema(
            description = "MobileNumber of Customer",
            example = "2435687928"
    )
    private String mobileNumber;

    @NotEmpty(message = "LoanNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "LoanNumber must be 12 digits")
    @Schema(
            description = "LoanNumber of Customer",
            example = "354657687980"
    )
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be null or empty")
    @Schema(
            description = "Type of loan",
            example = "Home loan"
    )
    private String loanType;

    @Positive(message = "TotalLoan amount should be greater than zero")
    @Schema(
            description = "Total loan amount",
            example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "AmountPaid should be greater or equal to 0")
    @Schema(
            description = "Total loan amount paid",
            example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "OutstandingAmount should be greater or equal to 0")
    @Schema(
            description = "Total outstanding amount against a loan",
            example = "99000"
    )
    private int outstandingAmount;
}


















