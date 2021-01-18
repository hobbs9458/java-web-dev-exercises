package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

public class SchoolPractice {

    public static void main(String[] args) {

        //create students
        Student student1 = new Student("Logan", 1, 5, 3.2);
        Student student2 = new Student("Kyle", 2, 6, 3.5);
        Student student3 = new Student("Stan", 3, 3, 3.9);
        Student student4 = new Student("Kayla", 4, 9, 4.0);

        //create course
        Course myCourse = new Course("Computer Programming", 2);

        //create list of students
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);

        //put list of students into course array list
        myCourse.setListOfStudents(listOfStudents);

        for (Student entry : listOfStudents) {
            System.out.println("\n" + "Name " + entry.getName() + "\n" + "GPA " + entry.getGpa() + "\n" + "Student ID: " + entry.getStudentId() + "\n" + "Number of Credits: " + entry.getNumberOfCredits());
        }

    }
}
