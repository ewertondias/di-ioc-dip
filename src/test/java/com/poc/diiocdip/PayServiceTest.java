package com.poc.diiocdip;

import com.poc.diiocdip.service.MGDeductionService;
import com.poc.diiocdip.service.PayService;
import com.poc.diiocdip.service.SPDeductionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PayServiceTest {

    @Test
    void testMGDeduction() {
        PayService payService = new PayService(new MGDeductionService());

        double tax = payService.tax(1000.0);

        Assertions.assertEquals(176.0, tax);
    }

    @Test
    void testSPDeduction() {
        PayService payService = new PayService(new SPDeductionService());

        double tax = payService.tax(1000.0);

        Assertions.assertEquals(180.0, tax);
    }

}
