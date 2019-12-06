package com.daniel;

import org.joda.time.DateTime;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, DateTime dateOfBirth, int id) {
        modules = new ArrayList<>();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.age = getAge();
        this.username = getUsername();
    }

    // Name getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Age getter and setter

    public int getAge() {
        Years years = Years.yearsBetween(getDateOfBirth(), new DateTime()); // Find number of years between date of birth and current date
        return years.getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Date of birth getter and setter

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // ID getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Username getter and setter

    public String getUsername() {
        return name + age; // Concatenation of name and age
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Course getter and setter

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Modules getter and setter

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module); // Add module to array list
    }

    // toString method

    public String toString() {
        return "Name: " + name + "\n"
                + "Date of birth: " + dateOfBirth + "\n"
                + "Age: " + age + "\n"
                + "ID: " + id + "\n"
                + "Username: " + username + "\n"
                + "Course: " + course + "\n"
                + "Modules:" + modules;
    }
}
