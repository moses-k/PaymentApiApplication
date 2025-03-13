package com.b2c.api.payments.impl;


import com.b2c.api.dto.MpesaPaymentRequestDTO;
import com.b2c.api.dto.PaymentRequestDTO;
import com.b2c.api.dto.PaymentResponseDTO;
import com.b2c.api.payments.MobileMoneyPaymentProcessor;

import java.time.LocalDateTime;

/**
 *
 * @author Moses Kipyegon
 */

public class MpesaPaymentProcessor implements MobileMoneyPaymentProcessor {
    @Override
    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {
        if (request instanceof MpesaPaymentRequestDTO) {
            MpesaPaymentRequestDTO mpesaRequest = (MpesaPaymentRequestDTO) request;
            // Process Mpesa-specific logic here
            //call third party api and get response

            return new PaymentResponseDTO("53VE88CXC6", "SUCCESS", "Mpesa Payment Successful", LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Invalid request type for Mpesa");
        }
    }

}


