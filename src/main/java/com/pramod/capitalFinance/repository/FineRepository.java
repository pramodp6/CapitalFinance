package com.pramod.capitalFinance.repository;

import com.pramod.capitalFinance.model.Fine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FineRepository extends JpaRepository<Fine, Long> {
}
