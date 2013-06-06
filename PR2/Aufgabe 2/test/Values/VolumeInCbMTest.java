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
import static Values.Values.*;
import static Values.TestConstant.*;

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
     * Test of cubcm method, of class VolumeInCbM.
     */
    @Test
    public void testCubcm() {
        assertEquals(5000000,vFiveCuM.cubcm(),DELTA);
    }

    /**
     * Test of cubm method, of class VolumeInCbM.
     */
    @Test
    public void testCubm() {
        assertEquals(5,vFiveCuM.cubm(),DELTA);
    }

    /**
     * Test of inverse method, of class VolumeInCbM.
     */
    @Test
    public void testInverse() {
        assertEquals(-5,vFiveCuM.inverse().cubm(),DELTA);
    }

    /**
     * Test of add method, of class VolumeInCbM.
     */
    @Test
    public void testAdd() {
        assertEquals(vTenCuM,vFiveCuM.add(vFiveCuM));
    }

    /**
     * Test of sub method, of class VolumeInCbM.
     */
    @Test
    public void testSub() {
        assertEquals(vFiveCuM,vTenCuM.sub(vFiveCuM));
    }

    /**
     * Test of mul method, of class VolumeInCbM.
     */
    @Test
    public void testMul() {
        assertEquals(vTenCuM,vFiveCuM.mul(TWO));
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_double() {
        assertEquals(vFiveCuM,vTenCuM.div(TWO));
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Volume() {
        assertEquals(TWO,vTenCuM.div(vFiveCuM),DELTA);
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Length() {
        assertEquals(aHunSqM,vOneThCuM.div(lTenM));
    }

    /**
     * Test of div method, of class VolumeInCbM.
     */
    @Test
    public void testDiv_Area() {
        assertEquals(lTenM,vOneThCuM.div(aHunSqM));
    }

    /**
     * Test of isZero method, of class VolumeInCbM.
     */
    @Test
    public void testIsZero() {
        assertTrue(vZeroCuM.isZero());
        assertTrue(!(vFiveCuM.isZero()));
    }

    /**
     * Test of isValid method, of class VolumeInCbM.
     */
    @Test
    public void testIsValid() {
        assertTrue(vFiveCuM.isValid());
    }

    /**
     * Test of compareTo method, of class VolumeInCbM.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,vTenCuM.compareTo(vFiveCuM));
        assertEquals(0,vTenCuM.compareTo(vTenCuM));
        assertEquals(-1,vTenCuM.compareTo(v25CuM));
    }

    /**
     * Test of equals method, of class VolumeInCbM.
     */
    @Test
    public void testEquals() {
        assertTrue(vTenCuM.equals(vTenCuM));
        assertTrue(!(vTenCuM.equals(v25CuM)));
    }
}
