/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Mass;
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
public class ForceInNTest {
    
    public ForceInNTest() {
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
     * Test of force method, of class ForceInN.
     */
    @Test
    public void testN() {
        assertEquals(5.0,fFiveN.n(),DELTA);
    }

    /**
     * Test of inverse method, of class ForceInN.
     */
    @Test
    public void testInverse() {
        assertEquals(-5,fFiveN.inverse().n(),DELTA);
    }

    /**
     * Test of add method, of class ForceInN.
     */
    @Test
    public void testAdd() {
        assertEquals(fTenN,fFiveN.add(fFiveN));
    }

    /**
     * Test of sub method, of class ForceInN.
     */
    @Test
    public void testSub() {
        assertEquals(fFiveN,fTenN.sub(fFiveN));
    }

    /**
     * Test of mul method, of class ForceInN.
     */
    @Test
    public void testMul_double() {
        assertEquals(fTenN,fFiveN.mul(TWO));
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_double() {
        assertEquals(fFiveN,fTenN.div(TWO));
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Force() {
        assertEquals(TWO,fTenN.div(fFiveN),DELTA);
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Acc() {
        assertEquals(mFiveKg,fTenN.div(aTwoMss));
    }

    /**
     * Test of div method, of class ForceInN.
     */
    @Test
    public void testDiv_Mass() {
        assertEquals(aTwoMss,fTenN.div(mFiveKg));
    }

    /**
     * Test of mul method, of class ForceInN.
     */
    @Test
    public void testMul_Length() {
        assertEquals(wTenJ,fFiveN.mul(lTwoM));
    }

    /**
     * Test of isZero method, of class ForceInN.
     */
    @Test
    public void testIsZero() {
        assertTrue(ZEROFORCE.isZero());
        assertTrue(!(fFiveN.isZero()));
    }

    /**
     * Test of isValid method, of class ForceInN.
     */
    @Test
    public void testIsValid() {
        assertTrue(fFiveN.isValid());
    }

    /**
     * Test of compareTo method, of class ForceInN.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,fTenN.compareTo(fFiveN));
        assertEquals(0,fFiveN.compareTo(fFiveN));
        assertEquals(-1,fFiveN.compareTo(fTenN));
    }

    /**
     * Test of equals method, of class ForceInN.
     */
    @Test
    public void testEquals() {
        assertTrue(fTenN.equals(fTenN));
        assertTrue(!(fTenN.equals(fFiveN)));
    }
}
