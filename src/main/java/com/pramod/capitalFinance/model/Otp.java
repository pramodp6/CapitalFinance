package com.pramod.capitalFinance.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "otp")
public class Otp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="otp_id" )
    private Long otpId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
