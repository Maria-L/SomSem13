	
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
 
import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Mass;
import Interfaces.Speed;
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
public class AccInMssTest {
    
    public AccInMssTest() {
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
     * Test of mss method, of class AccInMss.
     */
    @Test
    public void testMss() {
        assertEquals(2.0,aTwoMss.mss(),DELTA);
    }

    /**
     * Test of inverse method, of class AccInMss.
     */
    @Test
    public void testInverse() {
        assertEquals(-2.0,aTwoMss.inverse().mss(),DELTA);
    }

    /**
     * Test of add method, of class AccInMss.
     */
    @Test
    public void testAdd() {
        assertEquals(aTwoMss,aOneMss.add(aOneMss));
    }

    /**
     * Test of sub method, of class AccInMss.
     */
    @Test
    public void testSub() {
        assertEquals(aOneMss,aTwoMss.sub(aOneMss));
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_double() {
        assertEquals(aTwoMss,aOneMss.mul(TWO));
    }

    /**
     * Test of div method, of class AccInMss.
     */
    @Test
    public void testDiv_double() {
        assertEquals(aOneMss,aTwoMss.div(TWO));
    }

    /**
     * Test of div method, of class AccInMss.
     */
    @Test
    public void testDiv_Acc() {
        assertEquals(TWO,aTwoMss.div(aOneMss),DELTA);
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_TimeDiff() {
        assertEquals(sTwoMs,aOneMss.mul(tTwoS));
    }

    /**
     * Test of mul method, of class AccInMss.
     */
    @Test
    public void testMul_Mass() {
        assertEquals(fTwoN,aTwoMss.mul(mOneKg));
    }

    /**
     * Test of isZero method, of class AccInMss.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROACC.isZero());
        assertTrue(!(aOneMss.isZero()));
    }

    /**
     * Test of isValid method, of class AccInMss.
     */
    @Test
    public void testIsValid() {
        assertTrue(ZEROACC.isValid());
    }

    /**
     * Test of compareTo method, of class AccInMss.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,aTwoMss.compareTo(aOneMss));
        assertEquals(0,aOneMss.compareTo(aOneMss));
        assertEquals(-1,aOneMss.compareTo(aTwoMss));
    }

    /**
     * Test of equals method, of class AccInMss.
     */
    @Test
    public void testEquals() {
        assertTrue(aOneMss.equals(aOneMss));
        assertTrue(!(aOneMss.equals(aTwoMss)));
    }
}
