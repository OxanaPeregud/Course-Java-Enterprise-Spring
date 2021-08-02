package com.peregud.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-injection.xml");
        Course course = context.getBean(Course.class);
        course.displayStudents();
    }
}
