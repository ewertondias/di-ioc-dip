package com.poc.diiocdip.service;

public class PayService {

    /**
     * Invertemos o controle, usando injeção de dependência (via constructor)
     * E invertemos a dependencia utilzando uma interface e não injetando uma classe concreta diretamente, seguindo
     * o 5 conceito do SOLID D - Dependency Injection Principle
     *
     * Utilizando injecao de dependencia via construtor facilita os testes
     */
    private final DeductionService deductionService;

    public PayService(DeductionService deductionService) {
        this.deductionService = deductionService;
    }

    public double tax(double amount) {
        amount = amount - deductionService.deduction(amount);

        return amount * 0.2;
    }

}
