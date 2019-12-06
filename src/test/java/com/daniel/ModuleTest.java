package com.daniel;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ModuleTest {

    Module module1 = new Module("Software Engineering III", "CT417");

    Student student1 = new Student("Thomas Byrne", new DateTime(1998, 5, 12, 0, 0), 17352614);

    DateTime start = new DateTime(2019, 9, 10, 0, 0);
    DateTime end = new DateTime(2019, 12, 2, 0, 0);
    Course course1 = new Course("BCT4", start, end);

    /**
     * Test getModuleName method
     */
    @Test
    public void testGetModuleName() {
        String name = module1.getModuleName();
        assertEquals(name, "Software Engineering III");
    }

    /**
     * Test getModuleID method
     */
    @Test
    public void testGetModuleID() {
        String id = module1.getModuleID();
        assertEquals(id, "CT417");
    }

    /**
     * Test getStudents method
     */
    @Test
    public void testGetStudents() {
        module1.addStudent(student1);
        List<Student> expected = module1.getStudents();
        assertEquals(student1.toString(), expected.toString().substring(1, expected.toString().length() - 1));
    }

    /**
     * Test getCourses method
     */
    @Test
    public void testGetCourses() {
        module1.addCourse(course1);
        List<Course> expected = module1.getCourses();
        assertEquals(course1.toString(), expected.toString().substring(1, expected.toString().length() - 1));
    }

    /**
     * Test toString method
     */
    @Test
    public void testToString() {
        module1.addStudent(student1);
        module1.addCourse(course1);
        System.out.println(module1.toString());
    }
}
