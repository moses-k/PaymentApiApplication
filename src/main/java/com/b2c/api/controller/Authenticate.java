package com.b2c.api.controller;
import com.b2c.api.security.payload.AuthReq;
import com.b2c.api.security.payload.JwtResponse;
import com.b2c.api.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class Authenticate {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthReq req) {

      //  String apiUser = new String(Base64.getDecoder().decode(req.getApiUser()), StandardCharsets.UTF_8);
      //  String apiPass = new String(Base64.getDecoder().decode(req.getPassword()), StandardCharsets.UTF_8);

        String apiUser = "testUser";
        String apiPass = "test123";


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(apiUser, apiPass));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        return ResponseEntity.ok(new JwtResponse(jwt));
    }
}