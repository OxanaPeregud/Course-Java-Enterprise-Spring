package com.peregud.annotationinjection;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private Course course;
    private double averageMark;
    private List<String> subjects;

    @Autowired
    @CourseAnnotated
    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayStudents() {
        course.displayStudents();
    }
}
