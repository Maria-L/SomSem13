/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
import Interfaces.*;


/**
 *
 * @author abl128
 */
public final class Values {
    //Nicht instanziierbar
    private Values() {};
    
    //Potenzen
    public static final double NANO = Math.pow(10,-9);
    public static final double MICR = Math.pow(10,-6);
    public static final double MILI = Math.pow(10,-3);
    public static final double CENT = Math.pow(10,-2);
    public static final double DEZI = Math.pow(10,-1);
    public static final double KILO = Math.pow(10, 3);
    public static final double GIGA = Math.pow(10, 6);
    public static final double FEET = 0.3048;
    
    
    //Einzigartige öffentliche Konstanten
    public static final Length ZEROLENGTH           = lengthInM(0.0);
    public static final Angle ZEROANGLE             = angleInRad(0.0);
    public static final Acc ZEROACC                 = accInMss(0.0);
    public static final AngleSpeed ZEROANGLESPEED   = angleSpeedInDegS(0.0);
    public static final Area ZEROAREA               = areaInSqM(0.0);
    public static final Force ZEROFORCE             = forceInN(0.0);
    public static final Mass ZEROMASS               = massInKg(0.0);
    public static final Power ZEROPOWER             = powerInW(0.0);
    public static final Speed ZEROSPEED             = speedInMs(0.0);
    public static final TimeDiff ZEROTIMEDIFF       = timeDiffInS(0.0);
    public static final Volume ZEROVOLUME           = volumeInCbM(0.0);
    public static final Work ZEROWORK               = workInJ(0.0);
    
    
    //Package-Private Konversionskonstanten
    static final double FEETINMETERS        = 0.3048;
    static final double DEGINRAD            = 1/(2.0 * Math.PI / 360.0);
    static final double MSINKMH             = 1/3.6;
    static final double SINM                = 60;
    static final double SINH                = 3600;
    static final double SIND                = 86400;
    static final double SINWEEK             = 604800;
    static final double SINMONTH            = 2592000;
    static final double SINYEAR             = 31104000;
    
    //Factorymethoden - Length
    public static Length lengthInM(double meters) {
        return LengthInM.valueOf(meters);
    }

    public static Length lengthInKm(double meters) {
        return LengthInM.valueOf(meters * Values.KILO);
    }

    public static Length lengthInDm(double meters) {
        return LengthInM.valueOf(meters * Values.DEZI);
    }

    public static Length lengthInCm(double meters) {
        return LengthInM.valueOf(meters * Values.CENT);
    }

    public static Length lengthInMm(double meters) {
        return LengthInM.valueOf(meters * Values.MILI);
    }
    
    public static Length lengthInFt(double meters) {
        return LengthInM.valueOf(meters * Values.FEET);
    }
    
    //Factorymethoden - Angle
    public static Angle angleInRad(double degree) {
        return AngleInDeg.valueOf(degree * DEGINRAD);
    }
    
    public static Angle angleInDeg(double degree) {
        return AngleInDeg.valueOf(degree);
    }
    
    //Factorymethoden - Area
    public static Area areaInSqM(double sqm) {
        return AreaInSqM.valueOf(sqm);
    }
    
    public static Area areaInSqCm(double sqm) {
        return AreaInSqM.valueOf(sqm * Math.pow(CENT,2));
    }
    
    public static Area areaInSqKm(double sqm) {
        return AreaInSqM.valueOf(sqm * Math.pow(KILO,2));
    }
    
    //Factorymethoden - Power
    public static Power powerInKw(double w) {
        return PowerInW.valueOf(w * KILO);
    }
    
    public static Power powerInW(double w) {
        return PowerInW.valueOf(w);
    }
    
    //Factorymethoden - Length
    public static Speed speedInMs(double ms) {
        return SpeedInMs.valueOf(ms);
    }
    
    public static Speed speedInKmH(double ms) {
        return SpeedInMs.valueOf(ms * MSINKMH);
    }
    
    //Factorymethoden - TimeDiff
    public static TimeDiff timeDiffInS(double s) {
        return TimeDiffInS.valueOf(s);
    }
    
    public static TimeDiff timeDiffInNs(double s) {
        return TimeDiffInS.valueOf(s * NANO);   
    }
    
    public static TimeDiff timeDiffInMs(double s) {
        return TimeDiffInS.valueOf(s * MICR);
    }
    
    public static TimeDiff timeDiffInM(double s) {
        return TimeDiffInS.valueOf(s * SINM);
    }
    
    public static TimeDiff timeDiffInH(double s) {
        return TimeDiffInS.valueOf(s * SINH);
    }
    
    public static TimeDiff timeDiffInD(double s) {
        return TimeDiffInS.valueOf(s * SIND);
    }
    
    public static TimeDiff timeDiffInWeek(double s) {
        return TimeDiffInS.valueOf(s * SINWEEK);
    }
    
    public static TimeDiff timeDiffInMonth(double s) {
        return TimeDiffInS.valueOf(s * SINMONTH);
    }
    
    public static TimeDiff timeDiffInJear(double s) {
        return TimeDiffInS.valueOf(s * SINYEAR);
    }
    
    //Factorymethoden - Volumen
    public static Volume volumeInCbM(double cbm) {
        return VolumeInCbM.valueOf(cbm);
    }
    
    public static Volume volumeInCbCm(double cbm) {
        return VolumeInCbM.valueOf(cbm * Math.pow(CENT,3));
    }
    
    //Factorymethoden - Acceleration
    public static Acc accInMss(double mss) {
        return AccInMss.valueOf(mss);
    }
    
    //Factorymethoden - Force
    public static Force forceInN(double force) {
        return ForceInN.valueOf(force);
    }
    
    //Factorymethoden - Mass
    public static Mass massInKg(double kg) {
        return MassInKg.valueOf(kg);
    }
    
    public static Mass massInG(double kg) {
        return MassInKg.valueOf(kg * MILI);
    }
    
    public static Mass massInMg(double kg) {
        return MassInKg.valueOf(kg * MICR);
    }
    
    public static Mass massInT(double kg) {
        return MassInKg.valueOf(kg * KILO);
    }
    
    //Factorymethoden - Work
    public static Work workInJ(double j) {
        return WorkInJ.valueOf(j);
    }
    
    //Factorymethoden - AngleSpeed
    public static AngleSpeed angleSpeedInDegS(double degS) {
        return AngleSpeedInDegS.valueOf(degS);
    }
    
    public static AngleSpeed angleSpeedInRadS(double degS) {
        return AngleSpeedInDegS.valueOf(degS * DEGINRAD);
    }
}
