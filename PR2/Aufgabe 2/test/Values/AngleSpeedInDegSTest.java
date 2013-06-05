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
import static Values.TestConstant.*;
import static Values.Values.*;

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
     * Test of radS method, of class AngleSpeedInDegS.
     */
    @Test
    public void testRadS() {
        assertEquals(Math.PI,ans180DegS.rads(),DELTA);
    }

    /**
     * Test of degS method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDegS() {
        assertEquals(180,ans180DegInRadS.degs(),DELTA);
    }

    /**
     * Test of inverse method, of class AngleSpeedInDegS.
     */
    @Test
    public void testInverse() {
        assertEquals(-180,ans180DegS.inverse().degs(),DELTA);
    }

    /**
     * Test of add method, of class AngleSpeedInDegS.
     */
    @Test
    public void testAdd() {
        assertEquals(ans360DegS,ans180DegS.add(ans180DegS));
    }

    /**
     * Test of sub method, of class AngleSpeedInDegS.
     */
    @Test
    public void testSub() {
        assertEquals(ans180DegS,ans360DegS.sub(ans180DegS));
    }

    /**
     * Test of mul method, of class AngleSpeedInDegS.
     */
    @Test
    public void testMul_double() {
        assertEquals(ans360DegS,ans180DegS.mul(TWO));
    }

    /**
     * Test of div method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDiv_double() {
        assertEquals(ans180DegS,ans360DegS.div(TWO));
    }

    /**
     * Test of div method, of class AngleSpeedInDegS.
     */
    @Test
    public void testDiv_AngleSpeed() {
        assertEquals(TWO,ans360DegS.div(ans180DegS),DELTA);
    }

    /**
     * Test of mul method, of class AngleSpeedInDegS.
     */
    @Test
    public void testMul_TimeDiff() {
        assertEquals(an360Deg,ans180DegS.mul(tTwoS));
    }

    /**
     * Test of isZero method, of class AngleSpeedInDegS.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROANGLESPEED.isZero());
        assertTrue(!(ans180DegS.isZero()));
    }

    /**
     * Test of isValid method, of class AngleSpeedInDegS.
     */
    @Test
    public void testIsValid() {
        assertTrue(ans180DegS.isValid());
    }

    /**
     * Test of compareTo method, of class AngleSpeedInDegS.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,ans360DegS.compareTo(ans180DegS));
        assertEquals(0,ans180DegS.compareTo(ans180DegS));
        assertEquals(-1,ans180DegS.compareTo(ans360DegS));
    }

    /**
     * Test of equals method, of class AngleSpeedInDegS.
     */
    @Test
    public void testEquals() {
        assertTrue(ans180DegS.equals(ans180DegS));
        assertTrue(!(ans180DegS.equals(ans360DegS)));
    }
}
