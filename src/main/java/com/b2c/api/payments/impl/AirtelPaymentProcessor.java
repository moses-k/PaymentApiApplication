package com.b2c.api.payments.impl;


import com.b2c.api.dto.AirtelMoneyPaymentRequestDTO;
import com.b2c.api.dto.PaymentRequestDTO;
import com.b2c.api.dto.PaymentResponseDTO;
import com.b2c.api.payments.MobileMoneyPaymentProcessor;

import java.time.LocalDateTime;

/**
 *
 * @author Moses Kipyegon
 */

public class AirtelPaymentProcessor implements MobileMoneyPaymentProcessor {
    @Override
    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {
        if (request instanceof AirtelMoneyPaymentRequestDTO) {
            AirtelMoneyPaymentRequestDTO airtelMoneyRequest = (AirtelMoneyPaymentRequestDTO) request;
            // Process Airtel-specific logic here
            //call third party api and get response
            return new PaymentResponseDTO("SEF37890", "SUCCESS", "Airtel Payment Successful", LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Invalid request type for Airtel");
        }
    }

}