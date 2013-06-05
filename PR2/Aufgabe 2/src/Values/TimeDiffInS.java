/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
import Interfaces.*;
import static Values.Values.*;

/**
 *
 * @author Mooni
 */
public class TimeDiffInS implements TimeDiff{
    
    private final double s;
    
    //Creation
    
    private TimeDiffInS(double s){
        this.s = s;
    }
    
    public static TimeDiff valueOf(double s){
        return new TimeDiffInS(s);
    }
    //End Creation
    
    //Methods

    @Override
    public double ns() {
        return s/NANO;
    }

    @Override
    public double ms() {
        return s/MILI;
    }

    @Override
    public double s() {
        return s;
    }

    @Override
    public double m() {
        return s/SINM;
    }

    @Override
    public double h() {
        return s/SINH;
    }

    @Override
    public double d() {
        return s/SIND;
    }

    @Override
    public double week() {
        return s/SINWEEK;
    }

    @Override
    public double month() {
        return s/SINMONTH;
    }

    @Override
    public double year() {
        return s/SINYEAR;
    }

    @Override
    public TimeDiff inverse() {
        return timeDiffInS(-s) ;
    }

    @Override
    public TimeDiff add(TimeDiff timeDiff) {
        return timeDiffInS(s + timeDiff.s());
    }

    @Override
    public TimeDiff sub(TimeDiff timeDiff) {
        return timeDiffInS(s - timeDiff.s());
    }

    @Override
    public TimeDiff mul(double factor) {
        return timeDiffInS(s * factor);
    }

    @Override
    public TimeDiff div(double factor) {
        return timeDiffInS(s/factor);
    }

    @Override
    public double div(TimeDiff timediff) {
        return (s / timediff.s());
    }
    
    //

    @Override
    public Length mul(Speed speed) {
        return lengthInM(s*speed.ms());
    }

    @Override
    public Speed mul(Acc acc) {
        return speedInMs(s*acc.mss());
    }

    @Override
    public Work mul(Power power) {
        return workInJ(s*power.w());
    }

    @Override
    public boolean isZero() {
        return s == 0.0;
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(TimeDiff o) {
        return Double.compare(s, o.s());
    }
    
}
