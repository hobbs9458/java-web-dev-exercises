package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //fields
    private String subject;
    private int classCredits;
    private List<Student> listOfStudents = new ArrayList<>();

    //constructor
    public Course(String subject, int classCredits) {
        this.subject = subject;
        this.classCredits = classCredits;
    }

    //setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setClassCredits(int classCredits) {
        this.classCredits = classCredits;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    //getters
    public String getSubject() {
        return subject;
    }

    public int getClassCredits() {
        return classCredits;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

}
