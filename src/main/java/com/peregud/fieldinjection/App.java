package com.peregud.fieldinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("field-injection.xml");
        Student student = context.getBean(Student.class);
        student.displayStudents();
    }
}
