package com.peregud.fieldinjection;

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
        System.out.println(name + ":");
        students.forEach(System.out::println);
    }
}
