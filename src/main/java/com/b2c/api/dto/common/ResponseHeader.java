package com.b2c.api.dto.common;

import lombok.Data;

@Data
public class ResponseHeader {
    String responseCode;
    String responseMessage;
    String messageId;
}
