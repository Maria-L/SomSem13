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
import static Values.TestConstant.*;
import static Values.Values.*;

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
     * Test of sqcm method, of class AreaInSqM.
     */
    @Test
    public void testSqcm() {
        assertEquals(50000,aFiveSqM.sqcm(),DELTA);
    }

    /**
     * Test of sqm method, of class AreaInSqM.
     */
    @Test
    public void testSqm() {
        assertEquals(5,aFive0000SqCm.sqm(),DELTA);
    }

    /**
     * Test of sqkm method, of class AreaInSqM.
     */
    @Test
    public void testSqkm() {
        assertEquals(0.000005,aFiveSqM.sqkm(),DELTA);
    }

    /**
     * Test of inverse method, of class AreaInSqM.
     */
    @Test
    public void testInverse() {
        assertEquals(-5.0,aFiveSqM.inverse().sqm(),DELTA);
    }

    /**
     * Test of add method, of class AreaInSqM.
     */
    @Test
    public void testAdd() {
        assertEquals(aTenSqM,aFiveSqM.add(aFiveSqM));
    }

    /**
     * Test of sub method, of class AreaInSqM.
     */
    @Test
    public void testSub() {
        assertEquals(aFiveSqM,aTenSqM.sub(aFiveSqM));
    }

    /**
     * Test of mul method, of class AreaInSqM.
     */
    @Test
    public void testMul_double() {
        assertEquals(aTenSqM,aFiveSqM.mul(TWO));
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_double() {
        assertEquals(aFiveSqM,aTenSqM.div(TWO));
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_Area() {
        assertEquals(TWO,aTenSqM.div(aFiveSqM),DELTA);
    }

    /**
     * Test of mul method, of class AreaInSqM.
     */
    @Test
    public void testMul_Length() {
        assertEquals(v25CuM,aFiveSqM.mul(lFiveM));
    }

    /**
     * Test of div method, of class AreaInSqM.
     */
    @Test
    public void testDiv_Length() {
        assertEquals(lTwoM,aTenSqM.div(lFiveM));
    }

    /**
     * Test of isZero method, of class AreaInSqM.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROAREA.isZero());
        assertTrue(!(aFiveSqM.isZero()));
    }

    /**
     * Test of isValid method, of class AreaInSqM.
     */
    @Test
    public void testIsValid() {
        assertTrue(aFiveSqM.isValid());
    }

    /**
     * Test of compareTo method, of class AreaInSqM.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,aTenSqM.compareTo(aFiveSqM));
        assertEquals(0,aFiveSqM.compareTo(aFiveSqM));
        assertEquals(-1,aFiveSqM.compareTo(aTenSqM));
    }

    /**
     * Test of equals method, of class AreaInSqM.
     */
    @Test
    public void testEquals() {
        assertTrue(aFiveSqM.equals(aFiveSqM));
        assertTrue(!(aFiveSqM.equals(aTenSqM)));
    }
}
