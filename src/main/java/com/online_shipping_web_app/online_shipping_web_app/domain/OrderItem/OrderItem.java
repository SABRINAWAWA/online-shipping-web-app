package com.online_shipping_web_app.online_shipping_web_app.domain.OrderItem;

import com.online_shipping_web_app.online_shipping_web_app.domain.Order.Order;
import com.online_shipping_web_app.online_shipping_web_app.domain.Product.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class OrderItem {
    private int orderItemId;
    private Double purchasedPrice;
    private Integer quantity;
    private Double wholesalePrice;
    private Order order;
    private Product product;
}
