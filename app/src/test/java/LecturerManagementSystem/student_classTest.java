/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LecturerManagementSystem;

import java.util.Date;
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
public class student_classTest {
    public static student_class instance;
    
    
    public student_classTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        //(String name, int age, Date dob, String id)
        instance = new student_class("pedro", 19, new Date(2000/10/10), "19731444");
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
     * Test of getName method, of class student_class.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        //student_class instance = null;
        String expResult = "pedro";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class student_class.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        //student_class instance = null;
        instance.setName(name);
        String result = instance.getName();
        assertEquals(result, name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class student_class.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        //student_class instance = null;
        int expResult = 19;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class student_class.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        //student_class instance = null;
        instance.setAge(age);
        int result = instance.getAge();
        assertEquals(result,age);
    }

    /**
     * Test of getDob method, of class student_class.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        //student_class instance = null;
        Date expResult = new Date(2000/10/10);
        Date result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class student_class.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Date dob = null;
        //student_class instance = null;
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class student_class.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "19731444";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class student_class.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        //student_class instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getUsername method, of class student_class.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        
        String expResult = "pedro19";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
