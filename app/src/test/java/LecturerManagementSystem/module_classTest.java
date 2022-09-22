/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LecturerManagementSystem;

import java.util.List;
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
public class module_classTest {
    public static module_class instance;
    
    public module_classTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new module_class("science", "4BCT", "himself");
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
     * Test of getModName method, of class module_class.
     */
    @Test
    public void testGetModName() {
        System.out.println("getModName");
        String expResult = "";
        String result = instance.getModName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setModName method, of class module_class.
     */
    @Test
    public void testSetModName() {
        System.out.println("setModName");
        String modName = "";
        instance.setModName(modName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModID method, of class module_class.
     */
    @Test
    public void testGetModID() {
        System.out.println("getModID");
        String expResult = "4BCT";
        String result = instance.getModID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setModID method, of class module_class.
     */
    @Test
    public void testSetModID() {
        System.out.println("setModID");
        String modID = "";
        instance.setModID(modID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLecturer method, of class module_class.
     */
    @Test
    public void testGetLecturer() {
        System.out.println("getLecturer");
        String expResult = "";
        String result = instance.getLecturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLecturer method, of class module_class.
     */
    @Test
    public void testSetLecturer() {
        System.out.println("setLecturer");
        String lecturer = "";
        instance.setLecturer(lecturer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAssociatedCourses method, of class module_class.
     */
    @Test
    public void testGetAssociatedCourses() {
        System.out.println("getAssociatedCourses");
        List<String> expResult = null;
        List<String> result = instance.getAssociatedCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAssociatedCourses method, of class module_class.
     */
    @Test
    public void testSetAssociatedCourses() {
        System.out.println("setAssociatedCourses");
        List<String> associatedCourses = null;
        instance.setAssociatedCourses(associatedCourses);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class module_class.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        List<String> expResult = null;
        List<String> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class module_class.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        List<String> students = null;
        instance.setStudents(students);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
