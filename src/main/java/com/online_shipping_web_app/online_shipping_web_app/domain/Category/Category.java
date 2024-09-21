package com.online_shipping_web_app.online_shipping_web_app.domain.Category;

import com.online_shipping_web_app.online_shipping_web_app.domain.Product.Product;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
public class Category {
    private int categoryId;
    private String name;
    private String description;
    private List<Product> productList;
}
