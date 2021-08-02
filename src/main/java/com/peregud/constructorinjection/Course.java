package com.peregud.constructorinjection;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private Integer id;
    private String name;
    private List<String> students;

    public Course(String name) {
        this.name = name;
    }

    public void displayStudents() {
        students.forEach(System.out::println);
    }
}
