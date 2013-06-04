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
public class ForceInN implements Force{

    @Override
    public double j() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double kj() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force add(Force force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force sub(Force force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(Force force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Mass div(Acc acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Acc div(Mass mass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work mul(Length length) {
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
    public int compareTo(Force o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
