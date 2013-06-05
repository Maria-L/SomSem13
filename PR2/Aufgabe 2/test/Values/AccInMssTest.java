/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Mass;
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
public class AccInMssTest {
    
    public AccInMssTest() {
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
     * Test of valueOf method, of class AccInMss.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double mss = 0.0;
        AccInMss expResult = null;
        AccInMss result = AccInMss.valueOf(mss);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mss method, of class AccInMss.
     */
    @Test
    public void testMss() {
        System.out.println("mss");
        AccInMss instance = null;
        double expResult = 0.0;
        double result = instance.mss();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class AccInMss.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        AccInMss instance = null;
        Acc expResult = null;
        Acc result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AccInMss.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Acc acc = null;
        AccInMss instance = null;
        Acc expResult = null;
        Acc result = instance.add(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class AccInMss.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Acc acc = null;
        AccInMss instance = null;
        Acc expResult = null;
        Acc result = instance.sub(acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        AccInMss instance = null;
        Acc expResult = null;
        Acc result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AccInMss.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        AccInMss instance = null;
        Acc expResult = null;
        Acc result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AccInMss.
     */
    @Test
    public void testDiv_Acc() {
        System.out.println("div");
        Acc acc = null;
        AccInMss instance = null;
        double expResult = 0.0;
        double result = instance.div(acc);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_TimeDiff() {
        System.out.println("mul");
        TimeDiff time = null;
        AccInMss instance = null;
        Speed expResult = null;
        Speed result = instance.mul(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_Mass() {
        System.out.println("mul");
        Mass mass = null;
        AccInMss instance = null;
        Force expResult = null;
        Force result = instance.mul(mass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class AccInMss.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        AccInMss instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class AccInMss.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        AccInMss instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AccInMss.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Acc o = null;
        AccInMss instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AccInMss.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AccInMss instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
