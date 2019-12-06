package com.daniel;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1 = new Student("Thomas Byrne", new DateTime(1998, 5, 12, 0, 0), 17352614);

    Module module1 = new Module("Software Engineering III", "CT417");

    DateTime start = new DateTime(2019, 9, 10, 0, 0);
    DateTime end = new DateTime(2019, 12, 2, 0, 0);
    Course course1 = new Course("BCT4", start, end);

    /**
     * Test getUsername method
     */
    @Test
    public void testGetUsername() {
        String studentUsername = student1.getUsername();
        assertEquals(studentUsername, "ThomasByrne21");
    }

    /**
     * Test getAge method
     */
    @Test
    public void testGetAge() {
        int studentAge = student1.getAge();
        assertEquals(studentAge, 21);
    }

    /**
     * Test getModules method
     */
    @Test
    public void testGetModules() {
        student1.addModule(module1);
        student1.setCourse(course1);
        List<Module> expected = student1.getModules();
        assertEquals(module1.toString(), expected.toString().substring(1, expected.toString().length() - 1));
    }

    /**
     * Test getCourse method
     */
    @Test
    public void testGetCourse() {
        student1.setCourse(course1);
        String courseName = student1.getCourse();
        assertEquals(courseName, "BCT4");
    }

    /**
     * Test toString method
     */
    @Test
    public void testToString() {
        student1.addModule(module1);
        student1.setCourse(course1);
        System.out.println(student1.toString());
    }
}
