/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
import Interfaces.*;

/**
 *
 * @author Mooni
 */
public class PowerInKw implements Power{

    @Override
    public double w() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double kw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power add(Power power) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power sub(Power power) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(Power power) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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
