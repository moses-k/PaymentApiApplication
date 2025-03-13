package com.b2c.api.security.payload;

import lombok.Data;

@Data
public class JwtResponse {
    private String token;

    public JwtResponse(String accessToken) {
        this.token = accessToken;
    }
}
