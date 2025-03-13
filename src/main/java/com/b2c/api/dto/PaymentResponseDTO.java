package com.b2c.api.dto;

import java.time.LocalDateTime;
/**
 *
 * @author Moses Kipyegon
 */
public class PaymentResponseDTO {
    private String transactionId;
    private String status;
    private String message;
    private LocalDateTime timestamp;

    public PaymentResponseDTO(String transactionId, String status, String message, LocalDateTime timestamp) {
        this.transactionId = transactionId;
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

