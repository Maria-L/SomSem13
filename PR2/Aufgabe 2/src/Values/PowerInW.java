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
public class PowerInW extends AbstractScalar implements Power, Comparable <Power>{
    
    private final double w;
    
    //Creation
    private PowerInW(double w){
        this.w = w;
    }
    
    public static Power valueOf(double w){
        return new PowerInW(w);
    }
    //End Creation
    
    //Methods#
    public double getSI() {
        return w();
    }

    @Override
    public double w() {
        return w;
    }

    @Override
    public double kw() {
        return w/KILO;
    }

    @Override
    public Power inverse() {
        return powerInW(-w);
    }
    
    //

    @Override
    public Power add(Power power) {
        return powerInW(w + power.w());
    }

    @Override
    public Power sub(Power power) {
        return powerInW(w - power.w());
    }

    @Override
    public Power mul(double factor) {
        return powerInW(w * factor);
    }

    @Override
    public Power div(double factor) {
       return powerInW(w/factor);
    }

    @Override
    public double div(Power power) {
        return (w/power.w());
    }
    
    //

    @Override
    public Work mul(TimeDiff time) {
        return workInJ(w*time.s());
    }

    @Override
    public Force div(Speed speed) {
        return forceInN(w/speed.ms());
    }

    @Override
    public int compareTo(Power o) {
        return Double.compare(w, o.w());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Power)) return false;
        return this.compareTo((Power)o) == 0;
    }
}
