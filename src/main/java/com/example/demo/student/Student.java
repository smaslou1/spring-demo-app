package com.example.demo.student;

public class Student {
    private String name;
    private String email;
    private int studentId;

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String email, int studentId) {
        this.name = name;
        this.email = email;
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getStudentId() {
        return studentId;
    }
}