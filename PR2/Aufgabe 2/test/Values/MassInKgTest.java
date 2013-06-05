/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Force;
import Interfaces.Mass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static Values.TestConstant.*;
import static Values.Values.*;
import static Values.TestConstants.*;

/**
 *
 * @author abl128
 */
public class MassInKgTest {
    
    public MassInKgTest() {
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
     * Test of mg method, of class MassInKg.
     */
    @Test
    public void testMg() {
        assertEquals(5000,mFiveG.mg(),DELTA);
    }

    /**
     * Test of g method, of class MassInKg.
     */
    @Test
    public void testG() {
        assertEquals(1000,mOneKg.g(),DELTA);
    }

    /**
     * Test of kg method, of class MassInKg.
     */
    @Test
    public void testKg() {
        assertEquals(5,mFiveThG.kg(),DELTA);
    }

    /**
     * Test of t method, of class MassInKg.
     */
    @Test
    public void testT() {
        assertEquals(5,mFiveThKg.t(),DELTA);
    }

    /**
     * Test of inverse method, of class MassInKg.
     */
    @Test
    public void testInverse() {
        assertEquals(-5000,mFiveThKg.inverse().kg(),DELTA);
    }

    /**
     * Test of add method, of class MassInKg.
     */
    @Test
    public void testAdd() {
        assertEquals(mTenKg,mFiveKg.add(mFiveKg));
    }

    /**
     * Test of sub method, of class MassInKg.
     */
    @Test
    public void testSub() {
        SassertEquals(mFiveKg,mTenKg.sub(mFiveKg));
    }

    /**
     * Test of mul method, of class MassInKg.
     */
    @Test
    public void testMul_double() {
        assertEquals(mTenKg,mFiveKg.mul(TWO),DELTA);
    }

    /**
     * Test of div method, of class MassInKg.
     */
    @Test
    public void testDiv_double() {
        assertEquals(mFiveKg,mTenKg.div(TWO),DELTA);
    }

    /**
     * Test of div method, of class MassInKg.
     */
    @Test
    public void testDiv_Mass() {
        assertEquals(TWO,mTenKg.div(mFiveKg),DELTA);
    }

    /**
     * Test of mul method, of class MassInKg.
     */
    @Test
    public void testMul_Acc() {
        assertEquals(fTenN,(mFiveKg.mul(aTwoMss)));
    }

    /**
     * Test of isZero method, of class MassInKg.
     */
    @Test
    public void testIsZero() {
        assertTrue(mZeroKg.isZero());
        assertTrue(!(mFiveKg.isZero()));
    }

    /**
     * Test of isValid method, of class MassInKg.
     */
    @Test
    public void testIsValid() {
        assertTrue(mFiveKg.isValid());
    }

    /**
     * Test of compareTo method, of class MassInKg.
     */
    @Test
    public void testCompareTo() {
        assertEquals(1,mFiveKg.compareTo(mOneKg));
        assertEquals(0,mFiveKg.compareTo(mFiveKg));
        assertEquals(-1,mFiveKg.compareTo(mTenKg));
    }

    /**
     * Test of equals method, of class MassInKg.
     */
    @Test
    public void testEquals() {
        assertTrue(mFiveKg.equals(mFiveKg));
        assertTrue(!(mFiveKg.equals(mTenKg)));
    }
}
