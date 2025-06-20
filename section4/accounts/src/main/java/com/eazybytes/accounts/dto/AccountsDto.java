package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(
        name = "Accounts",
        description = "Schema to hold the Account Information"
)
public class AccountsDto {

    @Schema(description = "Account Number of the Eazy Bank account")
    @Pattern(regexp = "^$|[0-9]{10}",message = "Account Number must be of 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the Eazy Bank account",example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be null or empty")
    private String accountType;

    @Schema(description = "Branch Address of the Customer")
    @NotEmpty(message = "Branch Address cannot be null or empty")
    private String branchAddress;

}
