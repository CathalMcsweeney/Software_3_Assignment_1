/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LecturerManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 2cath
 */
public class course_program_classTest {
    public static course_program_class instance;
    public static module_class mod;
    public static student_class stu;
    
    public course_program_classTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new  course_program_class("maths", new DateTime(2022,9,1,0,0,0,0) , new DateTime(2023,5,31,0,0,0,0));
        mod = new module_class("testName","testID");
        stu = new student_class("testname", 8, new Date(2000/10/10) , "id");
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getcName method, of class course_program_class.
     */
    @Test
    public void testGetcName() {
        System.out.println("getcName");
        String expResult = "maths";
        String result = instance.getcName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setcName method, of class course_program_class.
     */
    @Test
    public void testSetcName() {
        System.out.println("setcName");
        String cName = "";
        instance.setcName(cName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseModules method, of class course_program_class.
     */
    @Test
    public void testSetCourseModules() {
        System.out.println("setCourseModules");
        instance.setCourseModules(mod);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseStudents method, of class course_program_class.
     */
    @Test
    public void testGetCourseStudents() {
        System.out.println("getCourseStudents");
        List<student_class> expResult = new ArrayList<>();
        List<student_class> result = instance.getCourseStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourseStudents method, of class course_program_class.
     */
    @Test
    public void testSetCourseStudents() {
        System.out.println("setCourseStudents");
        List<String> courseStudents = null;
        instance.setCourseStudents(stu);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStartDate method, of class course_program_class.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        DateTime expResult = new DateTime(2022,9,1,0,0,0,0);
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class course_program_class.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime startDate = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class course_program_class.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        DateTime expResult = new DateTime(2023,5,31,0,0,0,0);
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class course_program_class.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime endDate = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
