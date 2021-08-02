package com.peregud.annotationinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-injection.xml");
        Student student = context.getBean(Student.class);
        student.displayStudents();
    }
}
