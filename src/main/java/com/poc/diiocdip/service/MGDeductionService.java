package com.poc.diiocdip.service;

public class MGDeductionService implements DeductionService {

    @Override
    public double deduction(double amount) {
        return amount * 0.12;
    }

}
