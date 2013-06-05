/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Power;
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
public class WorkInJTest {
    
    public WorkInJTest() {
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
     * Test of valueOf method, of class WorkInJ.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double j = 0.0;
        Work expResult = null;
        Work result = WorkInJ.valueOf(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of j method, of class WorkInJ.
     */
    @Test
    public void testJ() {
        System.out.println("j");
        WorkInJ instance = null;
        double expResult = 0.0;
        double result = instance.j();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kj method, of class WorkInJ.
     */
    @Test
    public void testKj() {
        System.out.println("kj");
        WorkInJ instance = null;
        double expResult = 0.0;
        double result = instance.kj();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class WorkInJ.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        WorkInJ instance = null;
        Work expResult = null;
        Work result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class WorkInJ.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Work work = null;
        WorkInJ instance = null;
        Work expResult = null;
        Work result = instance.add(work);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class WorkInJ.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Work work = null;
        WorkInJ instance = null;
        Work expResult = null;
        Work result = instance.sub(work);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class WorkInJ.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        double factor = 0.0;
        WorkInJ instance = null;
        Work expResult = null;
        Work result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        WorkInJ instance = null;
        Work expResult = null;
        Work result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Work() {
        System.out.println("div");
        Work work = null;
        WorkInJ instance = null;
        double expResult = 0.0;
        double result = instance.div(work);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Length() {
        System.out.println("div");
        Length length = null;
        WorkInJ instance = null;
        Force expResult = null;
        Force result = instance.div(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Force() {
        System.out.println("div");
        Force force = null;
        WorkInJ instance = null;
        Length expResult = null;
        Length result = instance.div(force);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_TimeDiff() {
        System.out.println("div");
        TimeDiff time = null;
        WorkInJ instance = null;
        Power expResult = null;
        Power result = instance.div(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class WorkInJ.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        WorkInJ instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class WorkInJ.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        WorkInJ instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class WorkInJ.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Work o = null;
        WorkInJ instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class WorkInJ.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        WorkInJ instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
