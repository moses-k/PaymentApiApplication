package com.b2c.api.dto;
/**
 *
 * @author Moses Kipyegon
 */
public class MpesaPaymentRequestDTO extends PaymentRequestDTO {
    private String mpesaServiceId;

    //There can be many fields that only Mpesa require I will add them here

    public String getMpesaServiceId() {
        return mpesaServiceId;
    }

    public void setMpesaServiceId(String mpesaServiceId) {
        this.mpesaServiceId = mpesaServiceId;
    }
}

