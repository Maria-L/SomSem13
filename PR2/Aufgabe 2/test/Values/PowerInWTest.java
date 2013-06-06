/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Force;
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
public class PowerInWTest {
    
    public PowerInWTest() {
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
     * Test of w method, of class PowerInW.
     */
    @Test
    public void testW() {
        assertEquals(pFiveKw,pFiveThW);
    }

    /**
     * Test of kw method, of class PowerInW.
     */
    @Test
    public void testKw() {
        assertEquals(pFiveThW,pFiveKw);
    }

    /**
     * Test of inverse method, of class PowerInW.
     */
    @Test
    public void testInverse() {
        assertEquals(-10,pTenW.inverse().w(),DELTA);
    }

    /**
     * Test of add method, of class PowerInW.
     */
    @Test
    public void testAdd() {
        assertEquals(pTenW,pFiveW.add(pFiveW));
    }

    /**
     * Test of sub method, of class PowerInW.
     */
    @Test
    public void testSub() {
        assertEquals(pFiveW,pTenW.sub(pFiveW));
    }

    /**
     * Test of mul method, of class PowerInW.
     */
    @Test
    public void testMul_double() {
        assertEquals(pTenW,pFiveW.mul(TWO),DELTA);
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_double() {
        assertEquals(pFiveW,pTenW.div(TWO),DELTA);
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_Power() {
        assertEquals(TWO,pTenW.div(pFiveW),DELTA);

    }

    /**
     * Test of mul method, of class PowerInW.
     */
    @Test
    public void testMul_TimeDiff() {
        assertEquals(wTenJ,pFiveW.mul(tTwoS));
    }

    /**
     * Test of div method, of class PowerInW.
     */
    @Test
    public void testDiv_Speed() {
        assertEquals(fFiveN,pTenW.div(sTwoMs));
    }

    /**
     * Test of isZero method, of class PowerInW.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZERO_POWER.isZero());
        assertTrue(!(pFiveW.isZero()));
    }

    /**
     * Test of isValid method, of class PowerInW.
     */
    @Test
    public void testIsValid() {
        assertTrue(pFiveW.isValid());
    }

    /**
     * Test of compareTo method, of class PowerInW.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,pTenW.compareTo(pFiveW));
        assertEquals(0,pFiveW.compareTo(pFiveW));
        assertEquals(-1,pFiveW.compareTo(pTenW));
    }

    /**
     * Test of equals method, of class PowerInW.
     */
    @Test
    public void testEquals() {
        assertTrue(pTenW.equals(pTenW));
        assertTrue(!(pTenW.equals(pFiveW)));
    }
}
