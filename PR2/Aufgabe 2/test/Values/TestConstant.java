/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
 
import static Values.Values.*;
import Interfaces.*;
 
/**
 *
 * @author Birger
 */
public class TestConstant {
     
    // CONSTANTS FOR ALL MY TESTS
     
    static Length lTenM= lengthInM(10.0);
    static Length lFiveM= lengthInM(5.0);
    static Length lTwoM= lengthInM(2.0);
    static Length lZeroM= lengthInM(0.0);
    static Length lFiveThM= lengthInM(5000);
    static Length lFiveThMm= lengthInMm(5000);
    static Length lFiveHunCm= lengthInCm(500);
    static Length lFiftyDm= lengthInDm(50);
    static Length lFiveKm= lengthInKm(5);
    static Length lFiveFt= lengthInFt(5);
 
    static Mass mZeroKg= massInKg(0.0);
    static Mass mFiveThMg= massInMg(5000);
    static Mass mFiveG= massInG(5);
    static Mass mFiveThG= massInG(5000);
    static Mass mThMg = massInMg(1000);
    static Mass mOneKg= massInKg(1);
    static Mass mFiveKg= massInKg(5);
    static Mass mTenKg= massInKg(10.0);
    static Mass mFiveThKg= massInKg(5000);
    static Mass mFiveT= massInT(5);
     
    static TimeDiff tZeroS= timeDiffInS(0.0);
    static TimeDiff tMsNs= timeDiffInNs(1000000);
    static TimeDiff tOneMs= timeDiffInMs(1);
    static TimeDiff tThMs= timeDiffInMs(1000);
    static TimeDiff tOneS= timeDiffInS(1.0);
    static TimeDiff tTwoS= timeDiffInS(2.0);
    static TimeDiff tFiveS= timeDiffInS(5.0);
    static TimeDiff tSixtyS= timeDiffInS(60);
    static TimeDiff tOneM= timeDiffInM(1);
    static TimeDiff tSixtyM= timeDiffInM(60);
    static TimeDiff tOneH= timeDiffInH(1);
    static TimeDiff t24H= timeDiffInH(24);
    static TimeDiff tOneD= timeDiffInD(1);
    static TimeDiff tSevenD= timeDiffInD(7.0);
    static TimeDiff tOneWeek= timeDiffInWeek(1.0);
    static TimeDiff tThirtyD= timeDiffInD(30.0);
    static TimeDiff tOneMonth= timeDiffInMonth(1.0);
    static TimeDiff t365D= timeDiffInD(SINYEAR);
    static TimeDiff tOneYear= timeDiffInJear(1);
     
    static Speed sOneMs= speedInMs(1.0);
    static Speed sTwoMs= speedInMs(2.0);
    static Speed sFiveMs= speedInMs(5.0);
    static Speed sTenMs= speedInMs(10.0);
    static Speed s3SixKmh= speedInKmH(3.6);
     
    static Acc aOneMss= accInMss(1.0);
    static Acc aTwoMss= accInMss(2.0);
     
    static Force fTwoN= forceInN(2.0);
    static Force fFiveN= forceInN(5.0);
    static Force fTenN= forceInN(10.0);
    static Force fTwoThN=forceInN(2000.0);
    static Force fTwoKn= forceInN(2.0);
     
    static Work wFiveKj= workInJ(5);
    static Work wFiveThJ= workInJ(5000.0);
    static Work wTenJ= workInJ(10.0);
    static Work wFiveJ= workInJ(5.0);
    static Work wZeroJ= workInJ(0.0);
     
    static Power pFiveW= powerInW(5.0);
    static Power pTenW= powerInW(10.0);
    static Power pFiveThW= powerInW(5000.0);
    static Power pFiveKw= powerInKw(5);
     
    static Area aFive0000SqCm= areaInSqCm(50000.0);
    static Area aFiveSqM= areaInSqM(5.0);
    static Area aTenSqM= areaInSqM(10.0);
    static Area aHunSqM= areaInSqM(100.0);
    static Area aFiftySqM = areaInSqM(50.0);
    static Area aFiveMegaSqM= areaInSqM(5000000.0);
    static Area aFiveSqKm= areaInSqKm(5);
     
    static Volume vFiveHuThCuCm= volumeInCbCm(5000000);
    static Volume vZeroCuM= volumeInCbM(0.0);
    static Volume vFiveCuM= volumeInCbM(5);
    static Volume vTenCuM= volumeInCbM(10.0);
    static Volume v25CuM= volumeInCbM(25.0);
    static Volume vOneThCuM= volumeInCbM(1000.0);
    static Volume vFiveGigaCuM= volumeInCbM(5*GIGA);
     
    static Angle an180Deg= angleInDeg(180);
    static Angle an360Deg= angleInDeg(360);
    static Angle an180DegInRad= angleInDeg(Math.PI);
     
    static AngleSpeed ans180DegS= angleSpeedInDegS(180);
    static AngleSpeed ans360DegS= angleSpeedInDegS(360);
    static AngleSpeed ans180DegInRadS= angleSpeedInRadS(Math.PI);
     
     
     
     
    static int TWO = 2;
     
    static double DELTA = 0.001;
    
    static double vaFeet = 1.524;
}