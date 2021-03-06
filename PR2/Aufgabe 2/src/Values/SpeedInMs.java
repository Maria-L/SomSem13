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
public class SpeedInMs extends AbstractScalar implements Speed, Comparable <Speed> {
    
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
    public double getSI() {
        return ms();
    }

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
        return speedInMs(-ms);
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
        return lengthInM(ms*time.s());
    }

    @Override
    public Acc div(TimeDiff time) {
        return accInMss(ms/time.s());
    }

    @Override
    public TimeDiff div(Acc acc) {
        return timeDiffInS(ms/acc.mss());
    }
    
    public Force dragForce(Speed maxSpeed, Power maxPower) {
        return forceInN((maxPower.w() / Math.pow(maxSpeed.ms(), 3)) * this.ms() * this.ms() * -1.0) ;
    }

    @Override
    public String toStringInKmh() {
        return Double.toString(ms);
    }

    @Override
    public int compareTo(Speed o) {
        return Double.compare(ms, o.ms());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Speed)) return false;
        return this.compareTo((Speed)o) == 0;
    }
    
    @Override
    public String toString() {
        return ("" + kmh() + " km/h");
    }
}
