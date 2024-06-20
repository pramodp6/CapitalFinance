package com.pramod.capitalFinance.controller;

import com.pramod.capitalFinance.service.CapitalFinanceSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/capitalFinance")
public class AdminFinanceController {

    @Autowired
private CapitalFinanceSevice capitalFinanceSevice;

    @PostMapping("/signUp")
    public String capitalFinaceData(){
        return "CapitalFinance";
    }
}
