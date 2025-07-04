package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the Customer",example = "test@info.com"
    )
    @NotEmpty(message = "email cannot be null or empty")
    @Email(message = "Please enter valid email")
    private String email;


    @Schema(
            description = "Mobile Number of the Customer",example = "9876543215"
    )
    @Pattern(regexp = "^$|[0-9]{10}",message = "Mobile number must be of 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;
}
