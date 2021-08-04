package com.peregud.annotationinjection;

import lombok.Data;

import java.util.List;

@Data
public class CourseA implements Course {
    private Integer id;
    private String name;
    private List<String> students;

    public CourseA(String name) {
        this.name = name;
    }

    @Override
    public void displayStudents() {
        System.out.println(name + ":");
        students.forEach(System.out::println);
    }
}
