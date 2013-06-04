/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.*;
import static Values.Values.*;

/**
 *
 * @author abl128
 */
public class AccInMss implements Acc {

    @Override
    public double mss() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc add(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc sub(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Speed mul(TimeDiff time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force mul(Mass mass) {
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
    public int compareTo(Acc o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
