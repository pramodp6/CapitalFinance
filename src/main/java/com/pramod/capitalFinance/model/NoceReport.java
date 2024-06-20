package com.pramod.capitalFinance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "noceReport")
public class NoceReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="noceReport_id" )
    private Long noceReportId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
