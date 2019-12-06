package com.daniel;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private String moduleID;
    private List<Student> students;
    private List<Course> courses;

    public Module(String moduleName, String moduleID) {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    // Module name getter and setter

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    // Module ID getter and setter

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    // Students getter and setter

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Course getter and setter

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // toString method

    public String toString() {
        return "Module: " + moduleName + "\n"
                + "Module ID: " + moduleID + "\n"
                + "Registered students: " + students + "\n"
                + "Associated courses: " + courses;
    }
}
