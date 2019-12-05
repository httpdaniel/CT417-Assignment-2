package com.daniel;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dateOfBirth;
    private int id;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, int age, String dateOfBirth, int id, Course course, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.course = course;
        this.modules = modules;
        this.username = setUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String setUsername() {
        username = name+Integer.toString(age);
        return username;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
