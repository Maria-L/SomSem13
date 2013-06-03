/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

/**
 *
 * @author abl128
 */
public final class Values {
    //Nicht instanziierbar
    private Values() {};
    
    //Einzigartige öffentliche Konstanten
    public static final Length ZEROLENGTH = lengthInM(0.0);
    public static final Angle ZEROANGLE = angleInRad(0.0);
    public static final Acc ZEROACC = ;
    public static final AngleSpeed ZEROANGLESPEED = ;
    public static final Area ZEROAREA = ;
    public static final Force ZEROFORCE = ;
    public static final Mass ZEROMASS = ;
    public static final Power ZEROPOWER = ;
    public static final Speed ZEROSPEED = ;
    public static final TimeDiff ZEROTIMEDIFF = ;
    public static final Volume ZEROVOLUME = ;
    public static final Work ZEROWORK = ;
    
    
    //Package-Private Konversionskonstanten
    static final double FEETINMETERS        = 0.3048;
    static final double DEGINRAD            = 2.0 * Math.PI / 360.0;
    
    //Factorymethoden
    public static Length lengthInM(double meters) {
        return LengthInM.valueOf(meters);
    }
    
    public static Length lengthInFt(double feet) {
        return LengthInM.valueOf(feet * FEET_IN_METER);
    }
}
