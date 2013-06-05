/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Mass;
import Interfaces.Work;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abl128
 */
public class ForceInNTest {
    
    public ForceInNTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of valueOf method, of class ForceInN.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double force = 0.0;
        ForceInN expResult = null;
        ForceInN result = ForceInN.valueOf(force);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of force method, of class ForceInN.
     */
    @Test
    public void testForce() {
        System.out.println("force");
        ForceInN instance = null;
        double expResult = 0.0;
        double result = instance.force();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class ForceInN.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        ForceInN instance = null;
        Force expResult = null;
        Force result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ForceInN.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Force force = null;
        ForceInN instance = null;
        Force expResult = null;
        Force result = instance.add(force);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class ForceInN.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Force force = null;
        ForceInN instance = null;
        Force expResult = null;
        Force result = instance.sub(force);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class ForceInN.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        ForceInN instance = null;
        Force expResult = null;
        Force result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        ForceInN instance = null;
        Force expResult = null;
        Force result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Force() {
        System.out.println("div");
        Force force = null;
        ForceInN instance = null;
        double expResult = 0.0;
        double result = instance.div(force);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Acc() {
        System.out.println("div");
        Acc acc = null;
        ForceInN instance = null;
        Mass expResult = null;
        Mass result = instance.div(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Mass() {
        System.out.println("div");
        Mass mass = null;
        ForceInN instance = null;
        Acc expResult = null;
        Acc result = instance.div(mass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class ForceInN.
     */
    @Test
    public void testMul_Length() {
        System.out.println("mul");
        Length length = null;
        ForceInN instance = null;
        Work expResult = null;
        Work result = instance.mul(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class ForceInN.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        ForceInN instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class ForceInN.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        ForceInN instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class ForceInN.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Force o = null;
        ForceInN instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ForceInN.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        ForceInN instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
