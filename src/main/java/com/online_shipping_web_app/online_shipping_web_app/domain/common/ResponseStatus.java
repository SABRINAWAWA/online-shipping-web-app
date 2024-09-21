package com.online_shipping_web_app.online_shipping_web_app.domain.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ResponseStatus {
    private boolean success;
    private String message;
}
