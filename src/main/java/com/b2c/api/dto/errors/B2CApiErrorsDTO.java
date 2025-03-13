package com.b2c.api.dto.errors;

import com.b2c.api.dto.common.ResponseHeader;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


public class B2CApiErrorsDTO extends ResponseHeader {
    private ResponseBody responseBody;

    public ResponseBody getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(ResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    public static class ResponseBody {
        @JsonIgnoreProperties(ignoreUnknown = true)
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
