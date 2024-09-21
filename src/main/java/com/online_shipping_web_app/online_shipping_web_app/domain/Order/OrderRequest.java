package com.online_shipping_web_app.online_shipping_web_app.domain.Order;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Builder
public class OrderRequest {
    @NotNull(message = "Date is required")
    private Timestamp datePlaced;
    @NotEmpty(message = "Order status is required")
    private String orderStatus;
    @NotNull(message = "User id is required")
    private int userId;
}
