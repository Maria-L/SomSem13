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
    
    private final double n;
    
    //Creation
    private ForceInN(double force) {
        this.n = force;
    }
    
    public static ForceInN valueOf(double force) {
        return new ForceInN(force);
    }
    //End Creation
    
    //Getter
    @Override
    public double n() {
        return n;
    }

    @Override
    public Force inverse() {
        return forceInN(-n);
    }

    @Override
    public Force add(Force force) {
        return forceInN(this.n() + force.n());
    }

    @Override
    public Force sub(Force force) {
        return forceInN(this.n() - force.n());
    }

    @Override
    public Force mul(double factor) {
        return forceInN(this.n() * factor);
    }

    @Override
    public Force div(double factor) {
        return forceInN(this.n() / factor);
    }

    @Override
    public double div(Force force) {
        return this.n() / force.n();
    }

    @Override
    public Mass div(Acc acc) {
        return massInKg(n() / acc.mss());
    }

    @Override
    public Acc div(Mass mass) {
        return accInMss(n() / mass.kg());
    }

    @Override
    public Work mul(Length length) {
        return workInJ(n() * length.m());
    }

    @Override
    public boolean isZero() {
        return n() == 0.0;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int compareTo(Force o) {
        return(Double.compare(n(), o.n()));
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Force)) return false;
        return this.compareTo((Force)o) == 0;
    }
}
