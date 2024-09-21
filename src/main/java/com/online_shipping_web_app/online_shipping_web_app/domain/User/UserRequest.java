package com.online_shipping_web_app.online_shipping_web_app.domain.User;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UserRequest {
    @NotEmpty(message = "Username is required")
    @Size(min=2, max=50, message="Username needs to have 2-50 characters")
    private String username;

    @NotEmpty(message = "First name is required")
    @Size(min=2, max=50, message="First name needs to have 2-50 characters")
    private String firstname;

    @NotEmpty(message = "Last name is required")
    @Size(min=2, max=50, message="Last name needs to have 2-50 characters")
    private String lastname;

    @NotEmpty(message = "Email is required")
    @Email(message="Invalid email format")
    private String email;

    @NotNull(message = "Password is required")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password must be at least 8 characters long, contain at least one digit, one uppercase letter, one lowercase letter, and one special character."
    )
    private String password;
}
