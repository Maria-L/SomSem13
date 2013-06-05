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
import static Values.Values.*;
import static Values.TestConstants.*;

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
     * Test of ns method, of class TimeDiffInS.
     */
    @Test
    public void testNs() {
        assertEquals(1000000000,tOneS.ns(),DELTA);
    }

    /**
     * Test of ms method, of class TimeDiffInS.
     */
    @Test
    public void testMs() {
        assertEquals(1000,tOneS.ms(),DELTA);
    }

    /**
     * Test of s method, of class TimeDiffInS.
     */
    @Test
    public void testS() {
        assertEquals(1,tOneS.s(),DELTA);
    }

    /**
     * Test of m method, of class TimeDiffInS.
     */
    @Test
    public void testM() {
        assertEquals(1,tSixtyS.m(),DELTA);
    }

    /**
     * Test of h method, of class TimeDiffInS.
     */
    @Test
    public void testH() {
        assertEquals(1,tSixtyM.h(),DELTA);
    }

    /**
     * Test of d method, of class TimeDiffInS.
     */
    @Test
    public void testD() {
        assertEquals(1,t24H.d(),DELTA);
    }

    /**
     * Test of week method, of class TimeDiffInS.
     */
    @Test
    public void testWeek() {
        assertEquals(1,tSevenD.week(),DELTA);
    }

    /**
     * Test of month method, of class TimeDiffInS.
     */
    @Test
    public void testMonth() {
        assertEquals(1,tThirtyD.month(),DELTA);
    }

    /**
     * Test of year method, of class TimeDiffInS.
     */
    @Test
    public void testYear() {
        assertEquals(1,t365D.year(),DELTA);
    }

    /**
     * Test of inverse method, of class TimeDiffInS.
     */
    @Test
    public void testInverse() {
        assertEquals(-30,tThirtyD.inverse().d(),DELTA);
    }

    /**
     * Test of add method, of class TimeDiffInS.
     */
    @Test
    public void testAdd() {
        assertEquals(tTwoS,tOneS.add(tOneS));
    }

    /**
     * Test of sub method, of class TimeDiffInS.
     */
    @Test
    public void testSub() {
        assertEquals(tOneS,tTwoS.sub(tOneS));
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_double() {
        assertEquals(tTwoS,tOneS.mul(TWO));
    }

    /**
     * Test of div method, of class TimeDiffInS.
     */
    @Test
    public void testDiv_double() {
        assertEquals(tOneS,tTwoS.div(TWO));
    }

    /**
     * Test of div method, of class TimeDiffInS.
     */
    @Test
    public void testDiv_TimeDiff() {
        assertEquals(TWO,tTwoS.div(tOneS),DELTA);
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Speed() {
        assertEquals(lFiveM,tOneS.mul(sFiveMs));
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Acc() {
        assertEquals(sFiveMs,tFiveS.mul(aOneMss));
    }

    /**
     * Test of mul method, of class TimeDiffInS.
     */
    @Test
    public void testMul_Power() {
        assertEquals(sFiveMs,tFiveS.mul(aOneMss));
    }

    /**
     * Test of isZero method, of class TimeDiffInS.
     */
    @Test
    public void testIsZero() {
        assertTrue(tZeroS.isZero());
        assertTrue(!(tOneS.isZero()));
    }

    /**
     * Test of isValid method, of class TimeDiffInS.
     */
    @Test
    public void testIsValid() {
        assertTrue(tOneS.isValid());
    }

    /**
     * Test of compareTo method, of class TimeDiffInS.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,tFiveS.compareTo(tOneS));
        assertEquals(0,tFiveS.compareTo(tFiveS));
        assertEquals(-1,tOneS.compareTo(tFiveS));
    }

    /**
     * Test of equals method, of class TimeDiffInS.
     */
    @Test
    public void testEquals() {
        assertTrue(tFiveS.equals(tFiveS));
        assertTrue(!(tFiveS.equals(tOneS)));
    }
}
