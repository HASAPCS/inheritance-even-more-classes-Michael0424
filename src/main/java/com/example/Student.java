package com.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<String> courses;

    public Student(String studentName, int studentId) {
        this.name = studentName;
        this.id = studentId;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setStudentName(String studentName) {
        this.name = studentName;
    }

    public void setStudentId(int studentId) {
        this.id = studentId;
    }

    public void setCourses(ArrayList<String> courses){
        this.courses=courses;
    }

}

    // TODO: Implement getters, setters, and any other methods you find necessary
