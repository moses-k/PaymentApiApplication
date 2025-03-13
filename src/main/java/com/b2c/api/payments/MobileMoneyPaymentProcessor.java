package com.b2c.api.payments;


import com.b2c.api.dto.PaymentRequestDTO;
import com.b2c.api.dto.PaymentResponseDTO;

public interface MobileMoneyPaymentProcessor {
    PaymentResponseDTO processPayment(PaymentRequestDTO request);
}
