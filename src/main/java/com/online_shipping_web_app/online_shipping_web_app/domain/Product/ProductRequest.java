package com.online_shipping_web_app.online_shipping_web_app.domain.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ProductRequest {
    @NotEmpty(message = "Description is required")
    @Size(min = 5, message = "Product description must be greater than 5 characters")
    private String description;

    @NotEmpty(message = "Name is required")
    @Size(min = 5, message = "Product name must be greater than 5 characters")
    private String name;

    @NotNull(message = "Quantity is required")
    private Integer quantity;

    @NotNull(message = "Retail Price is required")
    @Min(1)
    private Double retailPrice;

    @NotNull(message = "Wholesale Price is required")
    @Min(1)
    private Double wholesalePrice;

    @NotNull(message = "Category Id is required")
    private int categoryId;
}
