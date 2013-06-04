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
public class PowerInW implements Power{
    
    private final double w;
    
    //Creation
    private PowerInW(double w){
        this.w = w;
    }
    
    public static Power valueOf(double w){
        return new PowerInW(w);
    }
    //End Creation
    
    //Methods

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
        return valueOf(-w);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force div(Speed speed) {
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
    public int compareTo(Power o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
