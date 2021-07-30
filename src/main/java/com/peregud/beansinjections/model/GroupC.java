package com.peregud.beansinjections.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class GroupC implements Students {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double averageMark;
    private Subject subject;
    private Course course;

    @Autowired
    @Qualifier("subject3")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Autowired
    @CourseFirstAnnotated
    public void setCourse(Course course) {
        this.course = course;
    }
}
