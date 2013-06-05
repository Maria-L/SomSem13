/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Mass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static Values.TestConstant.*;

/**
 *
 * @author abl128
 */
public class MassInKgTest {
    
    public MassInKgTest() {
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
     * Test of mg method, of class MassInKg.
     */
    @Test
    public void testMg() {
        assertEquals(5000,mFiveG.mg(),DELTA);
    }

    /**
     * Test of g method, of class MassInKg.
     */
    @Test
    public void testG() {
        System.out.println("g");
        MassInKg instance = null;
        double expResult = 0.0;
        double result = instance.g();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kg method, of class MassInKg.
     */
    @Test
    public void testKg() {
        System.out.println("kg");
        MassInKg instance = null;
        double expResult = 0.0;
        double result = instance.kg();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t method, of class MassInKg.
     */
    @Test
    public void testT() {
        System.out.println("t");
        MassInKg instance = null;
        double expResult = 0.0;
        double result = instance.t();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class MassInKg.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        MassInKg instance = null;
        Mass expResult = null;
        Mass result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MassInKg.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Mass mass = null;
        MassInKg instance = null;
        Mass expResult = null;
        Mass result = instance.add(mass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class MassInKg.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Mass mass = null;
        MassInKg instance = null;
        Mass expResult = null;
        Mass result = instance.sub(mass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class MassInKg.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        MassInKg instance = null;
        Mass expResult = null;
        Mass result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class MassInKg.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        MassInKg instance = null;
        Mass expResult = null;
        Mass result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class MassInKg.
     */
    @Test
    public void testDiv_Mass() {
        System.out.println("div");
        Mass mass = null;
        MassInKg instance = null;
        double expResult = 0.0;
        double result = instance.div(mass);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class MassInKg.
     */
    @Test
    public void testMul_Acc() {
        System.out.println("mul");
        Acc acc = null;
        MassInKg instance = null;
        Force expResult = null;
        Force result = instance.mul(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class MassInKg.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        MassInKg instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class MassInKg.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        MassInKg instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class MassInKg.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Mass o = null;
        MassInKg instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MassInKg.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        MassInKg instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
