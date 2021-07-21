package com.peregud.dependencyinjection.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChristmasDiscount implements Discount {
    private ShopDiscount shopDiscount;
    private SupplierDiscount supplierDiscount;
    private final double discount = 50.0;

    @Autowired
    public ChristmasDiscount(ShopDiscount shopDiscount, SupplierDiscount supplierDiscount) {
        this.shopDiscount = shopDiscount;
        this.supplierDiscount = supplierDiscount;
    }

    @Override
    public void apply() {
        System.out.println("Applying Christmas discount");
    }

    @Override
    public Double calculateDiscount() {
        return discount;
    }

    @Override
    public void calculationError() throws Exception {
        System.out.println("Can't calculate Christmas discount");
        throw new Exception("Christmas discount error");
    }
}
