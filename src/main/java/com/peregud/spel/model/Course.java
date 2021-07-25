package com.peregud.spel.model;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private Integer id;
    private String name;
    private List<String> students;
}
