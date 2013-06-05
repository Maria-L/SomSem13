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
public class AngleSpeedInDegSTest {
    
    public AngleSpeedInDegSTest() {
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
     * Test of valueOf method, of class AngleSpeedInDegS.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double degS = 0.0;
        AngleSpeed expResult = null;
        AngleSpeed result = AngleSpeedInDegS.valueOf(degS);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radS method, of class AngleSpeedInDegS.
     */
    @Test
    public void testRadS() {
        System.out.println("radS");
        AngleSpeedInDegS instance = null;
        double expResult = 0.0;
        double result = instance.radS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of degS method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDegS() {
        System.out.println("degS");
        AngleSpeedInDegS instance = null;
        double expResult = 0.0;
        double result = instance.degS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class AngleSpeedInDegS.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        AngleSpeedInDegS instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AngleSpeedInDegS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AngleSpeed angleSpeed = null;
        AngleSpeedInDegS instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.add(angleSpeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class AngleSpeedInDegS.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        AngleSpeed angleSpeed = null;
        AngleSpeedInDegS instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.sub(angleSpeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AngleSpeedInDegS.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        AngleSpeedInDegS instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        AngleSpeedInDegS instance = null;
        AngleSpeed expResult = null;
        AngleSpeed result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDiv_AngleSpeed() {
        System.out.println("div");
        AngleSpeed angleSpeed = null;
        AngleSpeedInDegS instance = null;
        double expResult = 0.0;
        double result = instance.div(angleSpeed);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AngleSpeedInDegS.
     */
    @Test
    public void testMul_TimeDiff() {
        System.out.println("mul");
        TimeDiff time = null;
        AngleSpeedInDegS instance = null;
        Angle expResult = null;
        Angle result = instance.mul(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class AngleSpeedInDegS.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        AngleSpeedInDegS instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class AngleSpeedInDegS.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        AngleSpeedInDegS instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AngleSpeedInDegS.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        AngleSpeed o = null;
        AngleSpeedInDegS instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AngleSpeedInDegS.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AngleSpeedInDegS instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
