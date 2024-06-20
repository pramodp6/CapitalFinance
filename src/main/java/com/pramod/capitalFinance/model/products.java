package com.pramod.capitalFinance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "products")
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="product_id" )
    private Long productId;
    @Column(name ="create_at" )
    private LocalDateTime createAt;
    @Column(name ="update_at" )
    private LocalDateTime updateAt;
}
