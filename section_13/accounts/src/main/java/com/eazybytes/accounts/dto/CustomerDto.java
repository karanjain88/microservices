package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
// @Schema is used to display custom name/description for a Schema in Swagger UI
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information."
)
public class CustomerDto {

    @Schema(
            // We are NOT using 'name' attribute because we are fine with the field name.
            description = "Name of the customer", example = "Madan Reddy"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "Length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            // We are NOT using 'name' attribute because we are fine with the field name.
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            // We are NOT using 'name' attribute because we are fine with the field name.
            description = "Mobile number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
