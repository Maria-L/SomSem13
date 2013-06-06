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
public class AreaInSqM extends AbstractScalar implements Area, Comparable <Area> {

    private final double sqm;

    //Creation
    private AreaInSqM(double sqm) {
        this.sqm = sqm;
    }

    public static Area valueOf(double sqm) {
        return new AreaInSqM(sqm);
    }
    //End Creation

    // Methods
    public double getSI() {
        return sqm();
    }
    
    @Override
    public double sqcm() {
        return (sqm / Math.pow(CENT,2));
    }

    @Override
    public double sqm() {
        return sqm;
    }

    @Override
    public double sqkm() {
        return (sqm / Math.pow(KILO, 2));
    }

    @Override
    public Area inverse() {
        return areaInSqM(-this.sqm);
    }

    //Methods
    @Override
    public Area add(Area area) {
        return areaInSqM(this.sqm + area.sqm());
    }

    @Override
    public Area sub(Area area) {
        return areaInSqM(this.sqm - area.sqm());
    }

    @Override
    public Area mul(double factor) {
        return areaInSqM(this.sqm * factor);
    }

    @Override
    public Area div(double factor) {
        return areaInSqM(this.sqm / factor);
    }

    @Override
    public double div(Area area) {
        return (this.sqm / area.sqm());
    }

    // 
    @Override
    public Volume mul(Length length) {
        return volumeInCbM(sqm() * length.m());
    }

    @Override
    public Length div(Length length) {
        return lengthInM(sqm() / length.m());
    }

    @Override
    public int compareTo(Area o) {
        return (Double.compare(sqm(), o.sqm()));
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Area)) return false;
        return this.compareTo((Area)o) == 0;
    }
}
