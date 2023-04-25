package com.ltp.gradesubmission;

public class Grade {
    private  String name;
    private String subject;
    private String grade;

    public Grade(String name, String subject, String grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public Grade() {

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
}
