package com.peregud.beansinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class XmlApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotations.xml");

        List<?> students = (List<?>) context.getBean("studentsList");
        students.forEach(System.out::println);
    }
}
