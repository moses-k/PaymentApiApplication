package com.b2c.api.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Moses Kipyegon
 */
@Service

public class SMSNotificationService {

    public void sendSMSNotification(String mobileNumber, String message) {
        System.out.println("Sending SMS to " + mobileNumber + ": " + message);
    }
}
