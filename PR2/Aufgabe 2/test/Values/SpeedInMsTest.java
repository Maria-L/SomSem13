/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Length;
import Interfaces.Speed;
import Interfaces.TimeDiff;
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
public class SpeedInMsTest {
    
    public SpeedInMsTest() {
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
     * Test of valueOf method, of class SpeedInMs.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double ms = 0.0;
        Speed expResult = null;
        Speed result = SpeedInMs.valueOf(ms);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ms method, of class SpeedInMs.
     */
    @Test
    public void testMs() {
        System.out.println("ms");
        SpeedInMs instance = null;
        double expResult = 0.0;
        double result = instance.ms();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kmh method, of class SpeedInMs.
     */
    @Test
    public void testKmh() {
        System.out.println("kmh");
        SpeedInMs instance = null;
        double expResult = 0.0;
        double result = instance.kmh();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class SpeedInMs.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        SpeedInMs instance = null;
        Speed expResult = null;
        Speed result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SpeedInMs.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Speed speed = null;
        SpeedInMs instance = null;
        Speed expResult = null;
        Speed result = instance.add(speed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class SpeedInMs.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Speed speed = null;
        SpeedInMs instance = null;
        Speed expResult = null;
        Speed result = instance.sub(speed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class SpeedInMs.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        SpeedInMs instance = null;
        Speed expResult = null;
        Speed result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        SpeedInMs instance = null;
        Speed expResult = null;
        Speed result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_Speed() {
        System.out.println("div");
        Speed speed = null;
        SpeedInMs instance = null;
        double expResult = 0.0;
        double result = instance.div(speed);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class SpeedInMs.
     */
    @Test
    public void testMul_TimeDiff() {
        System.out.println("mul");
        TimeDiff time = null;
        SpeedInMs instance = null;
        Length expResult = null;
        Length result = instance.mul(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_TimeDiff() {
        System.out.println("div");
        TimeDiff time = null;
        SpeedInMs instance = null;
        Acc expResult = null;
        Acc result = instance.div(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_Acc() {
        System.out.println("div");
        Acc acc = null;
        SpeedInMs instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.div(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringInKmh method, of class SpeedInMs.
     */
    @Test
    public void testToStringInKmh() {
        System.out.println("toStringInKmh");
        SpeedInMs instance = null;
        String expResult = "";
        String result = instance.toStringInKmh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class SpeedInMs.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        SpeedInMs instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class SpeedInMs.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        SpeedInMs instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class SpeedInMs.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Speed o = null;
        SpeedInMs instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SpeedInMs.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        SpeedInMs instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
