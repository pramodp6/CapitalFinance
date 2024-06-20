package com.pramod.capitalFinance.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.math.BigDecimal;

@Data
@Entity
@Table(name ="capitalFinance")
public class CapitalFinace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "sender_account_number", nullable = false, length = 20)
    private String senderAccountNumber;
    @Column(name = "amount", nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TransactionStatus status;


}
