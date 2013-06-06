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
public class LengthInM extends AbstractScalar implements Length, Comparable <Length> {

    //Creation
    private final double meters;

    private LengthInM(double meters) {
        this.meters = meters;
    }

    public static Length valueOf(double meters) {
        return new LengthInM(meters);
    }
    //End Creation
    
    //Getter
    public double getSI() {
        return m();
    }
    
    @Override
    public double m() {
        return meters;
    }

    @Override
    public double km() {
        return (meters / Values.KILO);
    }

    @Override
    public double dm() {
        return (meters / Values.DEZI);
    }

    @Override
    public double cm() {
        return (meters / Values.CENT);
    }

    @Override
    public double mm() {
        return (meters / Values.MILI);
    }
    
    @Override
    public double ft() {
        return (meters / Values.FEET);
    }

    @Override
    public Length inverse() {
        return lengthInM(-this.m());
    }
    //End Getter
    
    @Override
    public Length add(Length length) {
        return lengthInM(this.m() + length.m());
    }

    @Override
    public Length sub(Length length) {
        return lengthInM(this.m() - length.m());
    }

    @Override
    public Length mul(double factor) {
        return lengthInM(this.m() * factor);
    }

    @Override
    public Length div(double factor) {
        return lengthInM(this.m() / factor);
    }

    @Override
    public double div(Length length) {
        return (this.m() / length.m());
    }
    
    //##################################################

    @Override
    public Area mul(Length length) {
        return areaInSqM(m() * length.m());
    }

    @Override
    public TimeDiff div(Speed speed) {
        return timeDiffInS(m() / speed.ms());
    }

    @Override
    public Speed div(TimeDiff time) {
        return speedInMs(m() / time.s());
    }

    @Override
    public Work mul(Force force) {
        return workInJ(m() * force.n());
    }
    
    @Override
    public Volume mul(Area area) {
        return volumeInCbM(m() * area.sqm());
    }

    @Override
    public int compareTo(Length o) {
        return(Double.compare(m(), o.m()));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Length)) return false;
        return this.compareTo((Length)o) == 0;
    }
}
