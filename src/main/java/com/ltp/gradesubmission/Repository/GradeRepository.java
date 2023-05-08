package com.ltp.gradesubmission.Repository;

import com.ltp.gradesubmission.Grade;

import java.util.ArrayList;
import java.util.List;

public class GradeRepository {

    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }

//    Creat Operation in CRUD
    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }

//    Update Operation in CRUD
    public void updateGrade(Grade grade, int index) {
        studentGrades.set(index, grade);
    }

//    Read Operation in CRUD
    public List<Grade> getGrades() {
        return studentGrades;
    }

}
