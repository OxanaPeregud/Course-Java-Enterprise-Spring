package com.peregud.dependencyinjection.domain;

import org.springframework.stereotype.Component;

@Component
public class IndependenceDayDiscount implements Discount {
    private final double discount = 10.0;

    @Override
    public void apply() {
        System.out.println("Applying Independence Day discount");
    }

    @Override
    public Double calculateDiscount() {
        return discount;
    }

    @Override
    public void calculationError() throws Exception {
        System.out.println("Can't calculate Independence Day discount");
        throw new Exception("Independence Day discount error");
    }
}
