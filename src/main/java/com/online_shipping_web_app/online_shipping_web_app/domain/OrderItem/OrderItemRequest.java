package com.online_shipping_web_app.online_shipping_web_app.domain.OrderItem;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class OrderItemRequest {
    @NotNull(message = "Purchased Price is required")
    @Min(1)
    private Double purchasedPrice;

    @NotNull(message = "Quantity is required")
    @Min(1)
    private Integer quantity;

    @NotNull(message = "Wholesale Price is required")
    @Min(1)
    private Double wholesalePrice;

    @NotNull(message = "Order Id is required")
    private int orderId;

    @NotNull(message = "Product Id is required")
    private int productId;
}
