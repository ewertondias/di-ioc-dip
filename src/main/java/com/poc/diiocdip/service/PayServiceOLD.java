package com.poc.diiocdip.service;

public class PayServiceOLD {

    /**
     * Service com alto acoplamento
     * Estamos utilizando diretamente a classe MGDeductionService que é uma implementação, devemos usar uma abstração
     * Estamos ferindo o 5 principio do SOLID D = Dependency Injection Principle onde diz que devemos utilizar
     * interfaces ou classes abstratas, ao inves de classes concretas.
     */
    private final MGDeductionService deductionService = new MGDeductionService();

    public double tax(double amount) {
        // Acoplamento
        amount = amount - deductionService.deduction(amount);

        return amount * 0.2;
    }

}
