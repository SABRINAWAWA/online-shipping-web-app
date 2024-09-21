package com.online_shipping_web_app.online_shipping_web_app.domain.Order;

import com.online_shipping_web_app.online_shipping_web_app.domain.OrderItem.OrderItem;
import com.online_shipping_web_app.online_shipping_web_app.domain.User.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@Builder
public class Order {
    private int orderId;
    private Timestamp datePlaced;
    private String orderStatus;
    private User user;
    private List<OrderItem> orderItemList;
}
