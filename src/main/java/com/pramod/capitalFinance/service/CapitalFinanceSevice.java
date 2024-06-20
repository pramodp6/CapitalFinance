package com.pramod.capitalFinance.service;


import com.pramod.capitalFinance.repository.CapitalFinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapitalFinanceSevice {
    @Autowired
    private CapitalFinanceRepository capitalFinanceRepository;
}
