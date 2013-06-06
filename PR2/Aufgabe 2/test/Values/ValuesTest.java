/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.Acc;
import Interfaces.Angle;
import Interfaces.AngleSpeed;
import Interfaces.Area;
import Interfaces.Force;
import Interfaces.Length;
import Interfaces.Mass;
import Interfaces.Power;
import Interfaces.Speed;
import Interfaces.TimeDiff;
import Interfaces.Volume;
import Interfaces.Work;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static Values.TestConstant.*;
import static Values.Values.*;

/**
 *
 * @author Mooni
 */
public class ValuesTest {
    
    public ValuesTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of lengthInM method, of class Values.
     */
    @org.junit.Test
    public void testLengthInM() {
        assertEquals(lFiveM,lFiveThMm);
    }

    /**
     * Test of lengthInKm method, of class Values.
     */
    @org.junit.Test
    public void testLengthInKm() {
        assertEquals(lFiveThM,lFiveKm);
    }

    /**
     * Test of lengthInDm method, of class Values.
     */
    @org.junit.Test
    public void testLengthInDm() {
        assertEquals(lFiveM,lFiftyDm);
    }

    /**
     * Test of lengthInCm method, of class Values.
     */
    @org.junit.Test
    public void testLengthInCm() {
        assertEquals(lFiveM,lFiveHunCm);
    }

    /**
     * Test of lengthInMm method, of class Values.
     */
    @org.junit.Test
    public void testLengthInMm() {
        assertEquals(lFiveM,lFiveThMm);
    }

    /**
     * Test of lengthInFt method, of class Values.
     */
    @org.junit.Test
    public void testLengthInFt() {
        assertEquals(lengthInM(vaFeet),lFiveFt);
    }

    /**
     * Test of angleInRad method, of class Values.
     */
    
    @org.junit.Test
    public void testAngleInRad() {
        assertEquals(an180DegInRad.deg(),an180Deg.deg(),DELTA);
    }

    /**
     * Test of angleInDeg method, of class Values.
     */
    @org.junit.Test
    public void testAngleInDeg() {
        assertEquals(an180Deg.deg(),an180DegInRad.deg(),DELTA);
    } 

    /**
     * Test of areaInSqM method, of class Values.
     */
    @org.junit.Test
    public void testAreaInSqM() {
        assertEquals(aFiveSqKm,aFiveMegaSqM);
    }

    /**
     * Test of areaInSqCm method, of class Values.
     */
    @org.junit.Test
    public void testAreaInSqCm() {
        assertEquals(aFiveSqM,aFive0000SqCm);
    }

    /**
     * Test of areaInSqKm method, of class Values.
     */
    @org.junit.Test
    public void testAreaInSqKm() {
        assertEquals(aFiveMegaSqM,aFiveSqKm);
    }

    /**
     * Test of powerInKw method, of class Values.
     */
    @org.junit.Test
    public void testPowerInKw() {
        assertEquals(pFiveThW,pFiveKw);
    }

    /**
     * Test of powerInW method, of class Values.
     */
    @org.junit.Test
    public void testPowerInW() {
        assertEquals(pFiveKw,pFiveThW);
    }

    /**
     * Test of speedInMs method, of class Values.
     */
    @org.junit.Test
    public void testSpeedInMs() {
        assertEquals(s3SixKmh,sOneMs);
    }

    /**
     * Test of speedInKmH method, of class Values.
     */
    @org.junit.Test
    public void testSpeedInKmH() {
        assertEquals(sOneMs,s3SixKmh);
    }

    /**
     * Test of timeDiffInS method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInS() {
        assertEquals(tOneM,tSixtyS);
    }

    /**
     * Test of timeDiffInNs method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInNs() {
        assertEquals(tOneMs.s(),tMsNs.s(),DELTA);
    }

    /**
     * Test of timeDiffInMs method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInMs() {
        assertEquals(tThMs.s(),tOneS.s(),DELTA);
    }

    /**
     * Test of timeDiffInM method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInM() {
        assertEquals(tOneH,tSixtyM);
    }

    /**
     * Test of timeDiffInH method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInH() {
        assertEquals(tOneD,t24H);
    }

    /**
     * Test of timeDiffInD method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInD() {
        assertEquals(tOneYear,t360D);
    }

    /**
     * Test of timeDiffInWeek method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInWeek() {
        assertEquals(tOneWeek,tSevenD);
    }

    /**
     * Test of timeDiffInMonth method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInMonth() {
        assertEquals(tOneMonth,tThirtyD);
    }

    /**
     * Test of timeDiffInJear method, of class Values.
     */
    @org.junit.Test
    public void testTimeDiffInJear() {
        assertEquals(t360D,tOneYear);
    }

    /**
     * Test of volumeInCbCm method, of class Values.
     */
    @org.junit.Test
    public void testVolumeInCbCm() {
        assertEquals(vFiveCuM.cubm(),vFiveHuThCuCm.cubm(),DELTA);
    }

    /**
     * Test of accInMss method, of class Values.
     */
    @org.junit.Test
    public void testAccInMss() {
        assertEquals(aOneMss,aOneMss);
    }

    /**
     * Test of massInKg method, of class Values.
     */
    @org.junit.Test
    public void testMassInKg() {
        assertEquals(mMilMg.kg(),mOneKg.kg(),DELTA);
    }

    /**
     * Test of massInG method, of class Values.
     */
    @org.junit.Test
    public void testMassInG() {
        assertEquals(mFiveKg,mFiveThG);
    }

    /**
     * Test of massInMg method, of class Values.
     */
    @org.junit.Test
    public void testMassInMg() {
        assertEquals(mFiveG,mFiveThMg);
    }

    /**
     * Test of massInT method, of class Values.
     */
    @org.junit.Test
    public void testMassInT() {
        assertEquals(mFiveT,mFiveThKg);
    }

    /**
     * Test of workInJ method, of class Values.
     */
    @org.junit.Test
    public void testWorkInJ() {
        assertEquals(wFiveKj.j(),wFiveThJ.j(),DELTA);
    }

    /**
     * Test of angleSpeedInDegS method, of class Values.
     */
    
    @org.junit.Test
    public void testAngleSpeedInDegS() {
        assertEquals(an180Deg.deg(),an180DegInRad.deg(),DELTA);
    }

    /**
     * Test of angleSpeedInRadS method, of class Values.
     */
    @org.junit.Test
    public void testAngleSpeedInRadS() {
        assertEquals(ans180DegS.degs(),ans180DegS.degs(),DELTA);
    }
}
