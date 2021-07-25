package com.peregud.beansinjections.model;

import lombok.Data;

@Data
@CourseFirstAnnotated
public class CourseFirst implements Course {
    private Long id;
    private String name;
}
