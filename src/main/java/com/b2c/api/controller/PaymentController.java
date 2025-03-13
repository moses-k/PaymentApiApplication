package com.b2c.api.controller;


import com.b2c.api.dto.PaymentRequestDTO;
import com.b2c.api.dto.PaymentResponseDTO;
import com.b2c.api.service.MobileMoneyService;
import com.b2c.api.service.SMSNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final MobileMoneyService mobileMoneyService;
    private final SMSNotificationService notificationService;

    @Autowired
    public PaymentController(MobileMoneyService mobileMoneyService, SMSNotificationService notificationService) {
        this.mobileMoneyService = mobileMoneyService;
        this.notificationService = notificationService;
    }

    @PostMapping("/b2c")
    public PaymentResponseDTO initiateB2CPayment(@RequestBody PaymentRequestDTO request) {
        PaymentResponseDTO response = mobileMoneyService.processPayment(request);
        notificationService.sendSMSNotification(request.getReceiverMobileNumber() ,response.getMessage()); //here response is sufficient to be received by sender as the success or fail message
        return response;
    }
}


