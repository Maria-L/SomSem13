/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Power;
import Interfaces.TimeDiff;
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
public class WorkInJTest {
    
    public WorkInJTest() {
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
     * Test of j method, of class WorkInJ.
     */
    @Test
    public void testJ() {
        assertEquals(10,wTenJ.j(),DELTA);
    }

    /**
     * Test of kj method, of class WorkInJ.
     */
    @Test
    public void testKj() {
        assertEquals(0.01,wTenJ.kj(),DELTA);
    }

    /**
     * Test of inverse method, of class WorkInJ.
     */
    @Test
    public void testInverse() {
        assertEquals(-10,wTenJ.inverse().j(),DELTA);
    }

    /**
     * Test of add method, of class WorkInJ.
     */
    @Test
    public void testAdd() {
        assertEquals(wTenJ,wFiveJ.add(wFiveJ));
    }

    /**
     * Test of sub method, of class WorkInJ.
     */
    @Test
    public void testSub() {
        assertEquals(wFiveJ,wTenJ.sub(wFiveJ));
    }

    /**
     * Test of mul method, of class WorkInJ.
     */
    @Test
    public void testMul() {
        assertEquals(wTenJ,wFiveJ.mul(TWO));
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_double() {
        assertEquals(wFiveJ,wTenJ.div(TWO));
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Work() {
        assertEquals(TWO,wTenJ.div(wFiveJ),DELTA);
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Length() {
        assertEquals(fFiveN,wTenJ.div(lTwoM));
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_Force() {
        assertEquals(lTwoM,wTenJ.div(fFiveN));
    }

    /**
     * Test of div method, of class WorkInJ.
     */
    @Test
    public void testDiv_TimeDiff() {
        assertEquals(pFiveW,wTenJ.div(tTwoS));
    }

    /**
     * Test of isZero method, of class WorkInJ.
     */
    @Test
    public void testIsZero() {
        assertTrue(!(wTenJ.isZero()));
        assertTrue(wZeroJ.isZero());
    }

    /**
     * Test of isValid method, of class WorkInJ.
     */
    @Test
    public void testIsValid() {
        assertTrue(wTenJ.isValid());
    }

    /**
     * Test of compareTo method, of class WorkInJ.
     */
    @Test
    public void testCompareTo() {
           assertEquals(1,wTenJ.compareTo(wFiveJ));
           assertEquals(0,wTenJ.compareTo(wTenJ));
           assertEquals(-1,wFiveJ.compareTo(wTenJ));
    }

    /**
     * Test of equals method, of class WorkInJ.
     */
    @Test
    public void testEquals() {
        assertTrue(wTenJ.equals(wTenJ));
        assertTrue(!(wTenJ.equals(wFiveJ)));
    }
}
