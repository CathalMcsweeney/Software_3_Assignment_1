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
public class lecturer_classTest {
    public static lecturer_class instance;
    
    public lecturer_classTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new lecturer_class("frunk", 39, new Date(1980/10/10), "752");
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
     * Test of getName method, of class lecturer_class.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "frunk";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class lecturer_class.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class lecturer_class.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 39;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class lecturer_class.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class lecturer_class.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Date expResult = new Date(1980/10/10);
        Date result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class lecturer_class.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Date dob = null;
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class lecturer_class.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "752";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class lecturer_class.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class lecturer_class.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "frunk39";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModulesTaught method, of class lecturer_class.
     */
    @Test
    public void testGetModulesTaught() {
        System.out.println("getModulesTaught");
        List<String> expResult = null;
        List<String> result = instance.getModulesTaught();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setModulesTaught method, of class lecturer_class.
     */
    @Test
    public void testSetModulesTaught() {
        System.out.println("setModulesTaught");
        List<String> modulesTaught = null;
        instance.setModulesTaught(modulesTaught);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class lecturer_class.
     */
    @Test
    public void testCreateUsername() {
        System.out.println("createUsername");
        String name = "sam";
        int age = 0;
        String expResult = "sam0";
        String result = instance.createUsername(name, age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
