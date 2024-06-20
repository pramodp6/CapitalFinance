package com.pramod.capitalFinance.repository;

import com.pramod.capitalFinance.model.CapitalFinace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapitalFinanceRepository extends JpaRepository<CapitalFinace, Long> {
}
