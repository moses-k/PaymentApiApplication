package com.b2c.api.dto;
/**
 *
 * @author Moses Kipyegon
 */
public class AirtelMoneyPaymentRequestDTO extends PaymentRequestDTO {
    private String airtelServiceId;

    //There can be many fields that only Airtel require I will add them here

    public String getAirtelServiceId () {
        return airtelServiceId;
    }

    public void setAirtelServiceId(String airtelServiceId) {
        this.airtelServiceId = airtelServiceId;
    }
}