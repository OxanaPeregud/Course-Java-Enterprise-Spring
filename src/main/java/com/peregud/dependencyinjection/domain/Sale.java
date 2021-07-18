package com.peregud.dependencyinjection.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sale {
    private final Discount discount;

    @Autowired
    public Sale(Discount discount) {
        this.discount = discount;
    }
    
    public void setDiscount() {
        discount.apply();
    }

    public void calcDiscount() {
        discount.calculateDiscount();
    }

    public void calcError() throws Exception {
        discount.calculationError();
    }
}
