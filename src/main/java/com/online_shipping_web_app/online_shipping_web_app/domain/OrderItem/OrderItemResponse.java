package com.online_shipping_web_app.online_shipping_web_app.domain.OrderItem;

import com.online_shipping_web_app.online_shipping_web_app.domain.common.ResponseStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class OrderItemResponse {
    private ResponseStatus status;
    private OrderItem orderItem;
}
