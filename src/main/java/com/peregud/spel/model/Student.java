package com.peregud.spel.model;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double averageMark;
    private List<String> subjects;
}
