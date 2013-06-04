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

    //Variablen
    
    private final double force;
    
    //Creation
    private ForceInN(double force) {
        this.force = force;
    }
    
    public static ForceInN valueOf(double force) {
        return new ForceInN(force);
    }
    //End Creation
    
    //Getter
    @Override
    public double force() {
        return force;
    }

    @Override
    public Force inverse() {
        return forceInN(force);
    }

    @Override
    public Force add(Force force) {
        return forceInN(this.force() + force.force());
    }

    @Override
    public Force sub(Force force) {
        return forceInN(this.force() - force.force());
    }

    @Override
    public Force mul(double factor) {
        return forceInN(this.force() * factor);
    }

    @Override
    public Force div(double factor) {
        return forceInN(this.force() / factor);
    }

    @Override
    public double div(Force force) {
        return this.force() / force.force();
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
