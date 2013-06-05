/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Area;
import Interfaces.Length;
import Interfaces.Volume;
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
public class AreaInSqMTest {
    
    public AreaInSqMTest() {
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
     * Test of valueOf method, of class AreaInSqM.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double sqm = 0.0;
        Area expResult = null;
        Area result = AreaInSqM.valueOf(sqm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqcm method, of class AreaInSqM.
     */
    @Test
    public void testSqcm() {
        System.out.println("sqcm");
        AreaInSqM instance = null;
        double expResult = 0.0;
        double result = instance.sqcm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqm method, of class AreaInSqM.
     */
    @Test
    public void testSqm() {
        System.out.println("sqm");
        AreaInSqM instance = null;
        double expResult = 0.0;
        double result = instance.sqm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqkm method, of class AreaInSqM.
     */
    @Test
    public void testSqkm() {
        System.out.println("sqkm");
        AreaInSqM instance = null;
        double expResult = 0.0;
        double result = instance.sqkm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class AreaInSqM.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        AreaInSqM instance = null;
        Area expResult = null;
        Area result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AreaInSqM.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Area area = null;
        AreaInSqM instance = null;
        Area expResult = null;
        Area result = instance.add(area);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class AreaInSqM.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Area area = null;
        AreaInSqM instance = null;
        Area expResult = null;
        Area result = instance.sub(area);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AreaInSqM.
     */
    @Test
    public void testMul_double() {
        System.out.println("mul");
        double factor = 0.0;
        AreaInSqM instance = null;
        Area expResult = null;
        Area result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        AreaInSqM instance = null;
        Area expResult = null;
        Area result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_Area() {
        System.out.println("div");
        Area area = null;
        AreaInSqM instance = null;
        double expResult = 0.0;
        double result = instance.div(area);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class AreaInSqM.
     */
    @Test
    public void testMul_Length() {
        System.out.println("mul");
        Length length = null;
        AreaInSqM instance = null;
        Volume expResult = null;
        Volume result = instance.mul(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_Length() {
        System.out.println("div");
        Length length = null;
        AreaInSqM instance = null;
        Length expResult = null;
        Length result = instance.div(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class AreaInSqM.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        AreaInSqM instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class AreaInSqM.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        AreaInSqM instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AreaInSqM.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Area o = null;
        AreaInSqM instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AreaInSqM.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AreaInSqM instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
