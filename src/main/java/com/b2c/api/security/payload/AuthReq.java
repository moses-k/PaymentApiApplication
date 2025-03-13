package com.b2c.api.security.payload;

import lombok.Data;

@Data
public class AuthReq {
    String apiUser;
    String password;
}
