package com.peregud.dependencyinjection.domain;

public interface Discount {
    void apply();
    Double calculateDiscount();
    void calculationError() throws Exception;
}
