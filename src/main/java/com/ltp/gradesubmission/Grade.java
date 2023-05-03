package com.ltp.gradesubmission;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Grade {
    @NotBlank(message = "Name can't be blank")
    private  String name;
    @NotBlank(message = "Subject can't be blank")
    private String subject;
    @Score(message = "Score must be a letter grade")
    private String grade;
    private String id;

//    public Grade(String name, String subject, String grade) {
//        this.name = name;
//        this.subject = subject;
//        this.grade = grade;
//    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
