package com.peregud.beansinjections.model;

import lombok.Data;

@Data
@CourseSecondAnnotated
public class CourseSecond implements Course {
    private Long id;
    private String name;
}
