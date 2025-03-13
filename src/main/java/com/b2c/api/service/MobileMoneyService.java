package com.b2c.api.service;

import com.b2c.api.dto.*;
import com.b2c.api.payments.MobileMoneyPaymentProcessor;
import com.b2c.api.payments.impl.MpesaPaymentProcessor;
import com.b2c.api.payments.impl.AirtelPaymentProcessor;
import com.b2c.api.payments.impl.EquitelPaymentProcessor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Moses Kipyegon
 */
@Service
public class MobileMoneyService {

    private final MobileMoneyPaymentProcessor mpesaProcessor = new MpesaPaymentProcessor();
    private final MobileMoneyPaymentProcessor airtelProcessor = new AirtelPaymentProcessor();
    private final MobileMoneyPaymentProcessor equitelProcessor = new EquitelPaymentProcessor();

    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {
        return switch (request) {
            case MpesaPaymentRequestDTO mpesaPaymentRequestDTO -> mpesaProcessor.processPayment(request);
            case AirtelMoneyPaymentRequestDTO airtelMoneyPaymentRequestDTO -> airtelProcessor.processPayment(request);
            case EquitelPaymentRequestDTO equitelPaymentRequestDTO -> equitelProcessor.processPayment(request);
            case null, default -> throw new IllegalArgumentException("Unsupported payment type");
        };
    }
}
