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
public class VolumeInCbMTest {
    
    public VolumeInCbMTest() {
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
     * Test of valueOf method, of class VolumeInCbM.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        double cbm = 0.0;
        Volume expResult = null;
        Volume result = VolumeInCbM.valueOf(cbm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cubcm method, of class VolumeInCbM.
     */
    @Test
    public void testCubcm() {
        System.out.println("cubcm");
        VolumeInCbM instance = null;
        double expResult = 0.0;
        double result = instance.cubcm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cubm method, of class VolumeInCbM.
     */
    @Test
    public void testCubm() {
        System.out.println("cubm");
        VolumeInCbM instance = null;
        double expResult = 0.0;
        double result = instance.cubm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class VolumeInCbM.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        VolumeInCbM instance = null;
        Volume expResult = null;
        Volume result = instance.inverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VolumeInCbM.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Volume volume = null;
        VolumeInCbM instance = null;
        Volume expResult = null;
        Volume result = instance.add(volume);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class VolumeInCbM.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Volume volume = null;
        VolumeInCbM instance = null;
        Volume expResult = null;
        Volume result = instance.sub(volume);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class VolumeInCbM.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        double factor = 0.0;
        VolumeInCbM instance = null;
        Volume expResult = null;
        Volume result = instance.mul(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_double() {
        System.out.println("div");
        double factor = 0.0;
        VolumeInCbM instance = null;
        Volume expResult = null;
        Volume result = instance.div(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Volume() {
        System.out.println("div");
        Volume volume = null;
        VolumeInCbM instance = null;
        double expResult = 0.0;
        double result = instance.div(volume);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Length() {
        System.out.println("div");
        Length length = null;
        VolumeInCbM instance = null;
        Area expResult = null;
        Area result = instance.div(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Area() {
        System.out.println("div");
        Area sqmeters = null;
        VolumeInCbM instance = null;
        Length expResult = null;
        Length result = instance.div(sqmeters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZero method, of class VolumeInCbM.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        VolumeInCbM instance = null;
        boolean expResult = false;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class VolumeInCbM.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        VolumeInCbM instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class VolumeInCbM.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Volume o = null;
        VolumeInCbM instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class VolumeInCbM.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        VolumeInCbM instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
