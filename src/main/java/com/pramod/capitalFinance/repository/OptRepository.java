package com.pramod.capitalFinance.repository;

import com.pramod.capitalFinance.model.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OptRepository extends JpaRepository<Otp, Long> {
}
