package com.peregud.annotationinjection;

import lombok.Data;

import java.util.List;

@Data
@CourseAnnotated
public class CourseB implements Course {
    private Integer id;
    private String name;
    private List<String> students;

    public CourseB(String name) {
        this.name = name;
    }

    @Override
    public void displayStudents() {
        System.out.println(name + ":");
        students.forEach(System.out::println);
    }
}
