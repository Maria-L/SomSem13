/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Area;
import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Speed;
import Interfaces.TimeDiff;
import Interfaces.Volume;
import Interfaces.Work;
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
public class LengthInMTest {
    
    public LengthInMTest() {
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
     * Test of m method, of class LengthInM.
     */
    @Test
    public void testM() {
        assertEquals(5,lFiveM.m(),DELTA);
    }

    /**
     * Test of km method, of class LengthInM.
     */
    @Test
    public void testKm() {
        assertEquals(5,lFiveKm.km(),DELTA);
    }

    /**
     * Test of dm method, of class LengthInM.
     */
    @Test
    public void testDm() {
        assertEquals(50,lFiftyDm.dm(),DELTA);
    }

    /**
     * Test of cm method, of class LengthInM.
     */
    @Test
    public void testCm() {
        assertEquals(500,lFiveHunCm.cm(),DELTA);
    }

    /**
     * Test of mm method, of class LengthInM.
     */
    @Test
    public void testMm() {
        assertEquals(5000,lFiveM.mm(),DELTA);
    }

    /**
     * Test of ft method, of class LengthInM.
     */
    @Test
    public void testFt() {
        assertEquals(16.4041995,lFiveM.ft(),DELTA);
    }

    /**
     * Test of inverse method, of class LengthInM.
     */
    @Test
    public void testInverse() {
        assertEquals(-5,lFiveM.inverse().m(),DELTA);
    }

    /**
     * Test of add method, of class LengthInM.
     */
    @Test
    public void testAdd() {
        assertEquals(lTenM,lFiveM.add(lFiveM));
    }

    /**
     * Test of sub method, of class LengthInM.
     */
    @Test
    public void testSub() {
        assertEquals(lFiveM,lTenM.sub(lFiveM));
    }

    /**
     * Test of mul method, of class LengthInM.
     */
    @Test
    public void testMul_double() {
        assertEquals(lTenM,lFiveM.mul(TWO));
    }

    /**
     * Test of div method, of class LengthInM.
     */
    @Test
    public void testDiv_double() {
         assertEquals(lFiveM,lTenM.div(TWO));
    }

    /**
     * Test of div method, of class LengthInM.
     */
    @Test
    public void testDiv_Length() {
        assertEquals(TWO,lTenM.div(lFiveM),DELTA);
    }

    /**
     * Test of mul method, of class LengthInM.
     */
    @Test
    public void testMul_Length() {
        
    }

    /**
     * Test of div method, of class LengthInM.
     */
    @Test
    public void testDiv_Speed() {
        assertEquals(aFiftySqM,lTenM.mul(lFiveM));
    }

    /**
     * Test of div method, of class LengthInM.
     */
    @Test
    public void testDiv_TimeDiff() {
        assertEquals(sFiveMs, lTenM.div(tTwoS));
    }

    /**
     * Test of mul method, of class LengthInM.
     */
    @Test
    public void testMul_Force() {
        assertEquals(wTenJ,lFiveM.mul(fTwoN));
    }

    /**
     * Test of mul method, of class LengthInM.
     */
    @Test
    public void testMul_Area() {
        assertEquals(v25CuM,lFiveM.mul(aFiveSqM));
    }

    /**
     * Test of isZero method, of class LengthInM.
     */
    @Test
    public void testIsZero() {
        assertTrue(!(lFiveM.isZero()));
        assertTrue(lZeroM.isZero());
    }

    /**
     * Test of isValid method, of class LengthInM.
     */
    @Test
    public void testIsValid() {
        assertTrue(lFiveM.isValid());
    }

    /**
     * Test of compareTo method, of class LengthInM.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,lTenM.compareTo(lFiveM));
        assertEquals(0,lFiveM.compareTo(lFiveM));
        assertEquals(-1,lFiveM.compareTo(lTenM));
    }

    /**
     * Test of equals method, of class LengthInM.
     */
    @Test
    public void testEquals() {
        assertTrue(lFiveM.equals(lFiveM));
        assertTrue(!(lFiveM.equals(lTenM)));
    }
}
