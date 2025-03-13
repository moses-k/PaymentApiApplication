package com.b2c.api.dto;
/**
 *
 * @author Moses Kipyegon
 */

public class EquitelPaymentRequestDTO extends PaymentRequestDTO {
    private String equitelServiceId;

    //There can be many fields that only Equitel require I will add them here

    public String getEquitelServiceId() {
        return equitelServiceId;
    }

    public void setMpesaServiceId(String equitelServiceId) {
        this.equitelServiceId = equitelServiceId;
    }
}