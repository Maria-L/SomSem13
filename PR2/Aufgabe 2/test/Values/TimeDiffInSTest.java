/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Length;
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
public class TimeDiffInSTest {
    
    public TimeDiffInSTest() {
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
     * Test of valueOf method, of class TimeDiffInS.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double s = 0.0;
        TimeDiff expResult = null;
        TimeDiff result = TimeDiffInS.valueOf(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ns method, of class TimeDiffInS.
     */
    @Test
    public void testNs() {
        System.out.println("ns");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.ns();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ms method, of class TimeDiffInS.
     */
    @Test
    public void testMs() {
        System.out.println("ms");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.ms();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of s method, of class TimeDiffInS.
     */
    @Test
    public void testS() {
        System.out.println("s");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.s();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of m method, of class TimeDiffInS.
     */
    @Test
    public void testM() {
        System.out.println("m");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.m();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of h method, of class TimeDiffInS.
     */
    @Test
    public void testH() {
        System.out.println("h");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.h();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of d method, of class TimeDiffInS.
     */
    @Test
    public void testD() {
        System.out.println("d");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.d();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of week method, of class TimeDiffInS.
     */
    @Test
    public void testWeek() {
        System.out.println("week");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.week();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of month method, of class TimeDiffInS.
     */
    @Test
    public void testMonth() {
        System.out.println("month");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.month();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of year method, of class TimeDiffInS.
     */
    @Test
    public void testYear() {
        System.out.println("year");
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.year();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class TimeDiffInS.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        TimeDiffInS instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class TimeDiffInS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        TimeDiff timeDiff = null;
        TimeDiffInS instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.add(timeDiff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class TimeDiffInS.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        TimeDiff timeDiff = null;
        TimeDiffInS instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.sub(timeDiff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        TimeDiffInS instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class TimeDiffInS.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        TimeDiffInS instance = null;
        TimeDiff expResult = null;
        TimeDiff result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class TimeDiffInS.
     */
    @Test
    public void testDiv_TimeDiff() {
        System.out.println("div");
        TimeDiff timediff = null;
        TimeDiffInS instance = null;
        double expResult = 0.0;
        double result = instance.div(timediff);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Speed() {
        System.out.println("mul");
        Speed speed = null;
        TimeDiffInS instance = null;
        Length expResult = null;
        Length result = instance.mul(speed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Acc() {
        System.out.println("mul");
        Acc acc = null;
        TimeDiffInS instance = null;
        Speed expResult = null;
        Speed result = instance.mul(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Power() {
        System.out.println("mul");
        Power power = null;
        TimeDiffInS instance = null;
        Work expResult = null;
        Work result = instance.mul(power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class TimeDiffInS.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        TimeDiffInS instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class TimeDiffInS.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        TimeDiffInS instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class TimeDiffInS.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        TimeDiff o = null;
        TimeDiffInS instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TimeDiffInS.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        TimeDiffInS instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
