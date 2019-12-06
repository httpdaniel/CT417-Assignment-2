package com.daniel;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    Student student1 = new Student("Thomas Byrne", new DateTime(1998, 5, 12, 0, 0), 17352614);

    Module module1 = new Module("Software Engineering III", "CT417");

    DateTime start = new DateTime(2019, 9, 10, 0, 0);
    DateTime end = new DateTime(2019, 12, 2, 0, 0);
    Course course1 = new Course("BCT4", start, end);

    /**
     * Test getCourseName method
     */
    @Test
    public void testGetCourseName() {
        String name = course1.getCourseName();
        assertEquals(name, "BCT4");
    }

    /**
     * Test getStartDate method
     */
    @Test
    public void testGetStartDate() {
        DateTime expected = course1.getStartDate();
        assertEquals(expected, start);
    }

    /**
     * Test getEndDate method
     */
    @Test
    public void testGetEndDate() {
        DateTime expected = course1.getEndDate();
        assertEquals(expected, end);
    }

    /**
     * Test getModules method
     */
    @Test
    public void testGetModules() {
        course1.addModule(module1);
        List<Module> expected = course1.getModules();
        assertEquals(module1.toString(), expected.toString().substring(1, expected.toString().length() - 1));
    }

    /**
     * Test getStudents method
     */
    @Test
    public void testGetStudents() {
        course1.addStudent(student1);
        List<Student> expected = course1.getStudents();
        assertEquals(student1.toString(), expected.toString().substring(1, expected.toString().length() - 1));
    }

    /**
     * Test toString method
     */
    @Test
    public void testToString() {
        course1.addModule(module1);
        course1.addStudent(student1);
        System.out.println(course1.toString());
    }
}
