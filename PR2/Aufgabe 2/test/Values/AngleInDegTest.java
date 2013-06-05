/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Angle;
import Interfaces.AngleSpeed;
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
public class AngleInDegTest {
    
    public AngleInDegTest() {
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
     * Test of valueOf method, of class AngleInDeg.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double degree = 0.0;
        Angle expResult = null;
        Angle result = AngleInDeg.valueOf(degree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rad method, of class AngleInDeg.
     */
    @Test
    public void testRad() {
        System.out.println("rad");
        AngleInDeg instance = null;
        double expResult = 0.0;
        double result = instance.rad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deg method, of class AngleInDeg.
     */
    @Test
    public void testDeg() {
        System.out.println("deg");
        AngleInDeg instance = null;
        double expResult = 0.0;
        double result = instance.deg();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class AngleInDeg.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        AngleInDeg instance = null;
        Angle expResult = null;
        Angle result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AngleInDeg.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Angle angle = null;
        AngleInDeg instance = null;
        Angle expResult = null;
        Angle result = instance.add(angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class AngleInDeg.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Angle angle = null;
        AngleInDeg instance = null;
        Angle expResult = null;
        Angle result = instance.sub(angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AngleInDeg.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        double factor = 0.0;
        AngleInDeg instance = null;
        Angle expResult = null;
        Angle result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        AngleInDeg instance = null;
        Angle expResult = null;
        Angle result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_Angle() {
        System.out.println("div");
        Angle angle = null;
        AngleInDeg instance = null;
        double expResult = 0.0;
        double result = instance.div(angle);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_TimeDiff() {
        System.out.println("div");
        TimeDiff time = null;
        AngleInDeg instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.div(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class AngleInDeg.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        AngleInDeg instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class AngleInDeg.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        AngleInDeg instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AngleInDeg.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Angle o = null;
        AngleInDeg instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AngleInDeg.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AngleInDeg instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
