package com.example;

import java.util.ArrayList;


public class Course {
    private String courseName;
    private String courseID;
    private ArrayList<Student> students;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.students = new ArrayList<Student>();
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public ArrayList <Student> getStudents(){
        return students;
    }
    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void dropStudent(Student student) {
        students.remove(student);
    }
        // TODO: Initialize the attributes
    }

    // TODO: Implement methods to enroll a student and drop a student

