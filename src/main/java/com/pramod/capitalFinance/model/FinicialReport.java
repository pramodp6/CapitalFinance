package com.pramod.capitalFinance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "finicialReport")
public class FinicialReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="finicialReport_id" )
    private Long finicialReportId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
