package com.peregud.dependencyinjection.app;

import com.peregud.dependencyinjection.config.AnnotationConfig;
import com.peregud.dependencyinjection.domain.Sale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Sale sale = context.getBean(Sale.class);
        sale.setDiscount();
    }
}
