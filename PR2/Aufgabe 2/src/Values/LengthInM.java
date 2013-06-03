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
public class LengthInM implements Length {

    double meters = 0.0;
    private LengthInM(double meters) {
        this.meters = meters;
    }
    
    @Override
    public double ft() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double m() {
        return meters;
    }

    @Override
    public double km() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double dm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double cm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double mm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length add(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length sub(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Area mul(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff div(Speed speed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Speed div(TimeDiff time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work mul(Force force) {
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
    public int compareTo(Length o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
