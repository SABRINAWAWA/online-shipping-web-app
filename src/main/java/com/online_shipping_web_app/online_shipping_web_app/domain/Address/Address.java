package com.online_shipping_web_app.online_shipping_web_app.domain.Address;

import com.online_shipping_web_app.online_shipping_web_app.domain.User.User;
import lombok.*;

@Setter
@Getter
@Builder
public class Address {
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String county;
    private String zipCode;
    private User user;
}
