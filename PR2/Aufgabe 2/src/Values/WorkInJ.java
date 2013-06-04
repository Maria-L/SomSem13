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
public class WorkInJ implements Work {

    @Override
    public double j() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double kj() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work inverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work add(Work work) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work sub(Work work) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work mul(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Work div(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double div(Work work) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Force div(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length div(Force force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power div(TimeDiff time) {
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
    public int compareTo(Work o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
