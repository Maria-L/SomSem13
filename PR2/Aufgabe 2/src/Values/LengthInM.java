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
public class LengthInM implements Length {

    //Create Block
    private final double meters;

    private LengthInM(double meters) {
        this.meters = meters;
    }

    public static Length valueOf(double meters) {
        return new LengthInM(meters);
    }
    //End Create Block
    
    //Getter
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
    public Volume mul(Area area) {
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
