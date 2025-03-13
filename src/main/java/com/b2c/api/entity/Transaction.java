package com.b2c.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Moses Kipyegon
 */

@Entity
@Data
@Table(name = "TRANSACTION")
public class Transaction implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TRAN_ID")
    private int tranId;

    @Column(name="AGENT_NO")
    private String agentNo;

    @Column(name="TERMINAL_ID")
    private String terminalId;

    @Column(name="REFERENCE_NO")
    private String referenceNo;

    @Column(name="TRANSACTION_CODE")
    private String transactionCode;

    @Column(name="TRANSACTION_ID")
    private String transactionId;

    @Column(name="TRANSACTION_AMOUNT")
    private double transactionAmount;

    @Column(name="NARRATIVE")
    private String narrative;

    @Column(name = "POSTING_DATE")
    Date postingDate;

    @Column(name="MESSAGE_ID")
    private String messageId;

    @Column(name="STATUS_CODE")
    private String statusCode;

    @Column(name="STATUS_DESC")
    private String statusDesc;

    @Column(name="MSG_DESC")
    private String msgDesc;

    @Column(name="MESSAGE_TYPE")
    private String messageType;

    @Column(name="CORE_TYPE")
    private String coreType;

}
