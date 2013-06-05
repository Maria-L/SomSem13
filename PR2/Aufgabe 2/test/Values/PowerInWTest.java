/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Force;
import Interfaces.Power;
import Interfaces.Speed;
import Interfaces.TimeDiff;
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
public class PowerInWTest {
    
    public PowerInWTest() {
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
     * Test of valueOf method, of class PowerInW.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double w = 0.0;
        Power expResult = null;
        Power result = PowerInW.valueOf(w);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of w method, of class PowerInW.
     */
    @Test
    public void testW() {
        System.out.println("w");
        PowerInW instance = null;
        double expResult = 0.0;
        double result = instance.w();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kw method, of class PowerInW.
     */
    @Test
    public void testKw() {
        System.out.println("kw");
        PowerInW instance = null;
        double expResult = 0.0;
        double result = instance.kw();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class PowerInW.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        PowerInW instance = null;
        Power expResult = null;
        Power result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class PowerInW.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Power power = null;
        PowerInW instance = null;
        Power expResult = null;
        Power result = instance.add(power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class PowerInW.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Power power = null;
        PowerInW instance = null;
        Power expResult = null;
        Power result = instance.sub(power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class PowerInW.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        PowerInW instance = null;
        Power expResult = null;
        Power result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        PowerInW instance = null;
        Power expResult = null;
        Power result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_Power() {
        System.out.println("div");
        Power power = null;
        PowerInW instance = null;
        double expResult = 0.0;
        double result = instance.div(power);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class PowerInW.
     */
    @Test
    public void testMul_TimeDiff() {
        System.out.println("mul");
        TimeDiff time = null;
        PowerInW instance = null;
        Work expResult = null;
        Work result = instance.mul(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_Speed() {
        System.out.println("div");
        Speed speed = null;
        PowerInW instance = null;
        Force expResult = null;
        Force result = instance.div(speed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class PowerInW.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        PowerInW instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class PowerInW.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        PowerInW instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class PowerInW.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Power o = null;
        PowerInW instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PowerInW.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PowerInW instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
