package com.online_shipping_web_app.online_shipping_web_app.domain.Address;

import com.online_shipping_web_app.online_shipping_web_app.domain.common.ResponseStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AddressResponse {
    private ResponseStatus status;
    private Address address;
}
