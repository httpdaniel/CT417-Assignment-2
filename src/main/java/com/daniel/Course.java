package com.daniel;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        modules = new ArrayList<>();
        students = new ArrayList<>();
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Course name getter and setter

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Modules getter and setter

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

   // Students getter and setter

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Start date getter and setter

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    // End date getter and setter

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    // toString method

    public String toString() {
        return "Course Name: " + courseName + "\n"
                + "Start date: " + startDate + "\n"
                + "End date: " + endDate + "\n"
                + "Modules in course: " + modules + "\n"
                + "Students in course: " + students;
    }
}
