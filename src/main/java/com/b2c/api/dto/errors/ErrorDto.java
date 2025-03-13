package com.b2c.api.dto.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDto {
    private String status;
    private String message;
    private int errorCode;
}

