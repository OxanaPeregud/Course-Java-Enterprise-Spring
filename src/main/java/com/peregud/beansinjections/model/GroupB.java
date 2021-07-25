package com.peregud.beansinjections.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class GroupB implements Students {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double averageMark;
    private Subject subject;
    private Course course;

    @Autowired
    @Qualifier("subject2")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Autowired
    @CourseSecondAnnotated
    public void setCourse(Course course) {
        this.course = course;
    }
}
