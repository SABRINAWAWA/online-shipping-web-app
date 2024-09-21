package com.online_shipping_web_app.online_shipping_web_app.domain.Product;

import com.online_shipping_web_app.online_shipping_web_app.domain.common.ResponseStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ProductResponse {
    private ResponseStatus status;
    private Product product;
}
