package com.online_shipping_web_app.online_shipping_web_app.domain.User;

import com.online_shipping_web_app.online_shipping_web_app.domain.common.ResponseStatus;
import lombok.*;

@Setter
@Getter
@Builder
public class UserResponse {
    private ResponseStatus status;
    private User user;
}
