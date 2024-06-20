package com.pramod.capitalFinance.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "pk")
public class FinacialAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="otp_id" )
    private Long otpId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
