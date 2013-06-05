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
public class AngleInDegTest {
    
    public AngleInDegTest() {
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
     * Test of rad method, of class AngleInDeg.
     */
    @Test
    public void testRad() {
        assertEquals(Math.PI,an180Deg.rad(),DELTA);
    }

    /**
     * Test of deg method, of class AngleInDeg.
     */
    @Test
    public void testDeg() {
        assertEquals(180,an180DegInRad.deg(),DELTA);
    }

    /**
     * Test of inverse method, of class AngleInDeg.
     */
    @Test
    public void testInverse() {
        assertEquals(-180,an180Deg.inverse().deg(),DELTA);
    }

    /**
     * Test of add method, of class AngleInDeg.
     */
    @Test
    public void testAdd() {
        assertEquals(an360Deg,an180Deg.add(an180Deg));
    }

    /**
     * Test of sub method, of class AngleInDeg.
     */
    @Test
    public void testSub() {
        assertEquals(an180Deg,an360Deg.sub(an180Deg));
    }

    /**
     * Test of mul method, of class AngleInDeg.
     */
    @Test
    public void testMul() {
        assertEquals(an360Deg,an180Deg.mul(TWO));
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_double() {
        assertEquals(an180Deg,an360Deg.div(TWO));
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_Angle() {
        assertEquals(TWO,an360Deg.div(an180Deg),DELTA);
    }

    /**
     * Test of div method, of class AngleInDeg.
     */
    @Test
    public void testDiv_TimeDiff() {
        assertEquals(ans180DegS,an360Deg.div(tTwoS));
    }

    /**
     * Test of isZero method, of class AngleInDeg.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROANGLE.isZero());
        assertTrue(!(an180Deg.isZero()));
    }

    /**
     * Test of isValid method, of class AngleInDeg.
     */
    @Test
    public void testIsValid() {
        assertTrue(an180Deg.isValid());
    }

    /**
     * Test of compareTo method, of class AngleInDeg.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,an360Deg.compareTo(an180Deg));
        assertEquals(0,an180Deg.compareTo(an180Deg));
        assertEquals(-1,an180Deg.compareTo(an360Deg));
    }

    /**
     * Test of equals method, of class AngleInDeg.
     */
    @Test
    public void testEquals() {
        assertTrue(an180Deg.equals(an180Deg));
        assertTrue(!(an180Deg.equals(an360Deg)));
    }
}
