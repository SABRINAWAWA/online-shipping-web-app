package com.online_shipping_web_app.online_shipping_web_app.domain.Category;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CategoryRequest {
    @NotEmpty(message = "Category name is required")
    @Size(min = 5, message = "Category name must be greater than 5 characters")
    private String name;

    @NotEmpty(message = "Category description is required")
    @Size(min = 10, message = "Category description must be greater than 10 characters")
    private String description;
}
