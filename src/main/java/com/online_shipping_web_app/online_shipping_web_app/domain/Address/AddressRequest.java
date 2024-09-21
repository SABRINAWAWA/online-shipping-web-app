package com.online_shipping_web_app.online_shipping_web_app.domain.Address;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@Builder
public class AddressRequest {
    @NotEmpty(message = "Street is required")
    @Size(min = 5, message = "Street must be greater than 5 characters")
    private String street;

    @NotEmpty(message = "City is required")
    @Size(min = 3, message = "City must be greater than 3 characters")
    private String city;

    @NotEmpty(message = "State is required")
    @Size(min = 3, message = "State must be greater than 3 characters")
    private String state;

    @NotEmpty(message = "County is required")
    @Size(min = 3, message = "State must be greater than 3 characters")
    private String county;

    @NotEmpty(message = "Zip Code is required")
    @Size(min = 5, max=5,message = "Zip Code must be exactly 5 characters")
    private String zipCode;

    @NotNull(message = "User id is required")
    private int userId;
}
