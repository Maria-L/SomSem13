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
public class ForceInN implements Force, Comparable <Force>{

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
        return massInKg(force() / acc.mss());
    }

    @Override
    public Acc div(Mass mass) {
        return accInMss(force() / mass.kg());
    }

    @Override
    public Work mul(Length length) {
        return workInJ(force() * length.m());
    }

    @Override
    public boolean isZero() {
        return force() == 0.0;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int compareTo(Force o) {
        return(Double.compare(force(), o.force()));
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Force)) return false;
        return this.compareTo((Force)o) == 0;
    }
}
