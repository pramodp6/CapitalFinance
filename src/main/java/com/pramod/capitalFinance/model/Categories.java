package com.pramod.capitalFinance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Category_id" )
    private Long CategoryId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
