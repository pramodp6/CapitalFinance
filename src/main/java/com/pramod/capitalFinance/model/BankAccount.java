package com.pramod.capitalFinance.model;

import com.pramod.capitalFinance.utility.LoanType;
import jakarta.persistence.*;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "rtgs_transactions")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "sender_account_number", nullable = false, length = 20)
    private String senderAccountNumber;

    @Column(name = "receiver_account_number", nullable = false, length = 20)
    private String receiverAccountNumber;

    @Column(name = "amount", nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TransactionStatus status;

    @Column(name = "description", length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type", nullable = false)
    private LoanType accountType;

}