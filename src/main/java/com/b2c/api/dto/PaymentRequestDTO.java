package com.b2c.api.dto;

import java.math.BigDecimal;
/**
 *
 * @author Moses Kipyegon
 */
public class PaymentRequestDTO {
    private BigDecimal amount;
    private String currency;
    private String senderName;
    private String senderPhoneNumber;
    private String senderCode;
    private String receiverName;
    private String receiverMobileNumber;
    private String narration;

    public PaymentRequestDTO() {
    }

    public PaymentRequestDTO(BigDecimal amount, String currency, String senderName, String senderCode,
                             String receiverName, String receiverMobileNumber, String narration) {
        this.amount = amount;
        this.currency = currency;
        this.senderPhoneNumber = currency;
        this.senderName = senderName;
        this.senderCode = senderCode;
        this.receiverName = receiverName;
        this.receiverMobileNumber = receiverMobileNumber;
        this.narration = narration;
    }

    // Getters and Setters
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSenderName() {
        return senderName;
    }
    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public void setSenderCode(String senderCode) {
        this.senderCode = senderCode;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobileNumber() {
        return receiverMobileNumber;
    }

    public void setReceiverMobileNumber(String receiverMobileNumber) {
        this.receiverMobileNumber = receiverMobileNumber;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
