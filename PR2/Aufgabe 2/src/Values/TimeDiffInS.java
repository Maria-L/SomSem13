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
public class TimeDiffInS implements TimeDiff{

    @Override
    public double ns() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double ms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double s() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double m() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double h() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double d() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double week() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double month() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double year() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff add(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff sub(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimeDiff div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(TimeDiff timediff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length mul(Speed speed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Speed mul(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work mul(Power power) {
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
    public int compareTo(TimeDiff o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
