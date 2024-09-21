package com.online_shipping_web_app.online_shipping_web_app.domain.Product;

import com.online_shipping_web_app.online_shipping_web_app.domain.Category.Category;
import com.online_shipping_web_app.online_shipping_web_app.domain.User.User;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
public class Product {
    private int productId;
    private String description;
    private String name;
    private Integer quantity;
    private Double retailPrice;
    private Double wholesalePrice;
    private Category category;
    private List<User> userList;
}
