package com.peregud.dependencyinjection.domain;

import org.springframework.stereotype.Component;

@Component
public class EasterDiscount implements Discount {
    private final double discount = 25.0;

    @Override
    public void apply() {
        System.out.println("Applying Easter discount");
    }

    @Override
    public Double calculateDiscount() {
        return discount;
    }

    @Override
    public void calculationError() throws Exception {
        System.out.println("Can't calculate Easter discount");
        throw new Exception("Easter discount error");
    }
}
