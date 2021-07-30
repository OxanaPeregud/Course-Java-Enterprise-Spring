package com.peregud.spel.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class XmlApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        List<?> students = (List<?>) context.getBean("studentsList");
        students.forEach(System.out::println);
        List<?> courses = (List<?>) context.getBean("coursesList");
        courses.forEach(System.out::println);
    }
}
