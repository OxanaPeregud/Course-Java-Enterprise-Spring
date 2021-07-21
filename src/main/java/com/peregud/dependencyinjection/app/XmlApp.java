package com.peregud.dependencyinjection.app;

import com.peregud.dependencyinjection.domain.Sale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApp {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic-config.xml");
        Sale sale = context.getBean(Sale.class);
        sale.setDiscount();
        sale.calcDiscount();
        sale.calcError();
    }
}
