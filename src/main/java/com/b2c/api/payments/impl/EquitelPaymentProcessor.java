package com.b2c.api.payments.impl;

import com.b2c.api.dto.EquitelPaymentRequestDTO;
import com.b2c.api.dto.MpesaPaymentRequestDTO;
import com.b2c.api.dto.PaymentRequestDTO;
import com.b2c.api.dto.PaymentResponseDTO;
import com.b2c.api.payments.MobileMoneyPaymentProcessor;

import java.time.LocalDateTime;

/**
 *
 * @author Moses Kipyegon
 */

public class EquitelPaymentProcessor implements MobileMoneyPaymentProcessor {
    @Override
    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {
        if (request instanceof EquitelPaymentRequestDTO) {
            EquitelPaymentRequestDTO  equitelRequest = (EquitelPaymentRequestDTO) request;
            // Process Equitel-specific logic here

            //call third party api and get response

            return new PaymentResponseDTO("2HM666DSVG", "SUCCESS", "Equitel Payment Successful", LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Invalid request type for Equitel");
        }
    }

}
