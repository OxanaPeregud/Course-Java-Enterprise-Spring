package com.peregud.dependencyinjection.config;

import com.peregud.dependencyinjection.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {

    @Bean
    public Sale sale(Discount discount) {
        return new Sale(discount);
    }

    @Bean
    public Discount discount(ShopDiscount shopDiscount, SupplierDiscount supplierDiscount) {
        return new ChristmasDiscount(shopDiscount, supplierDiscount);
    }

    @Bean
    public ShopDiscount shopDiscount() {
        return new ShopDiscount();
    }

    @Bean
    public SupplierDiscount supplierDiscount() {
        return new SupplierDiscount();
    }
}
