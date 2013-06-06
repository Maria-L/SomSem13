/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Length;
import Interfaces.Speed;
import Interfaces.TimeDiff;
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
public class SpeedInMsTest {
    
    public SpeedInMsTest() {
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
     * Test of ms method, of class SpeedInMs.
     */
    @Test
    public void testMs() {
        assertEquals(s3SixKmh,sOneMs);
    }

    /**
     * Test of kmh method, of class SpeedInMs.
     */
    @Test
    public void testKmh() {
        assertEquals(sOneMs,s3SixKmh);
    }

    /**
     * Test of inverse method, of class SpeedInMs.
     */
    @Test
    public void testInverse() {
        assertEquals(-5.0,sFiveMs.inverse().ms(),DELTA);
    }

    /**
     * Test of add method, of class SpeedInMs.
     */
    @Test
    public void testAdd() {
        assertEquals(sTenMs,sFiveMs.add(sFiveMs));
    }

    /**
     * Test of sub method, of class SpeedInMs.
     */
    @Test
    public void testSub() {
        assertEquals(sFiveMs,sTenMs.sub(sFiveMs));

    }

    /**
     * Test of mul method, of class SpeedInMs.
     */
    @Test
    public void testMul_double() {
        assertEquals(sTenMs,sFiveMs.mul(TWO));
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_double() {
        assertEquals(sFiveMs,sTenMs.div(TWO));
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_Speed() {
        assertEquals(TWO,sTenMs.div(sFiveMs),DELTA);
    }

    /**
     * Test of mul method, of class SpeedInMs.
     */
    @Test
    public void testMul_TimeDiff() {
        assertEquals(lTenM,sFiveMs.mul(tTwoS));
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_TimeDiff() {
        assertEquals(aTwoMss,sTenMs.div(tFiveS));
    }

    /**
     * Test of div method, of class SpeedInMs.
     */
    @Test
    public void testDiv_Acc() {
        assertEquals(tFiveS,sTenMs.div(aTwoMss));
    }

    /**
     * Test of isZero method, of class SpeedInMs.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROSPEED.isZero());
        assertTrue(!(sFiveMs.isZero()));
    }

    /**
     * Test of isValid method, of class SpeedInMs.
     */
    @Test
    public void testIsValid() {
        assertTrue(sFiveMs.isValid());
    }

    /**
     * Test of compareTo method, of class SpeedInMs.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,sTenMs.compareTo(sFiveMs));
        assertEquals(0,sFiveMs.compareTo(sFiveMs));
        assertEquals(-1,sFiveMs.compareTo(sTenMs));
    }

    /**
     * Test of equals method, of class SpeedInMs.
     */
    @Test
    public void testEquals() {
        assertTrue(sTenMs.equals(sTenMs));
        assertTrue(!(sTenMs.equals(sFiveMs)));
    }
}
