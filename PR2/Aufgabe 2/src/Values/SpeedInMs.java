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
public class SpeedInMs implements Speed {
    
    private final double ms;
    
    //Creation
    private SpeedInMs(double ms){
        this.ms = ms;
    }
    public static Speed valueOf(double ms){
        return new SpeedInMs(ms);
    }
    
    //End Creation
    
    //Methods

    @Override
    public double ms() {
        return ms;
    }

    @Override
    public double kmh() {
        return ms/MSINKMH;
    }

    @Override
    public Speed inverse() {
        return valueOf(-ms);
    }

    @Override
    public Speed add(Speed speed) {
        return speedInMs(ms + speed.ms());
    }

    @Override
    public Speed sub(Speed speed) {
        return speedInMs(ms - speed.ms());
    }

    @Override
    public Speed mul(double factor) {
        return speedInMs(ms * factor);
    }

    @Override
    public Speed div(double factor) {
        return speedInMs(ms / factor);
    }

    @Override
    public double div(Speed speed) {
        return (ms/speed.ms());
    }
    
    //

    @Override
    public Length mul(TimeDiff time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc div(TimeDiff time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff div(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toStringInKmh() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isZero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Speed o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
