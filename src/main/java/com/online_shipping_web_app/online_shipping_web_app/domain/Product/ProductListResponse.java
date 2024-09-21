package com.online_shipping_web_app.online_shipping_web_app.domain.Product;

import com.online_shipping_web_app.online_shipping_web_app.domain.common.ResponseStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ProductListResponse {
    private ResponseStatus status;
    private List<Product> product;
}
