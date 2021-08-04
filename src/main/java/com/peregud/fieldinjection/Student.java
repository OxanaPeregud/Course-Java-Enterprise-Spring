package com.peregud.fieldinjection;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;

    @Autowired
    private Course course;

    private double averageMark;
    private List<String> subjects;

    public void displayStudents() {
        course.displayStudents();
    }
}
