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
public class AreaInSqM implements Area{
    
    private final double sqm;
    
    //Creation
    
    private AreaInSqM(double sqm){
        this.sqm = sqm;
    }
    
    public static Area valueOf(double sqm){
        return new AreaInSqM(sqm);
    }
    //End Creation
    
    // Methods

    @Override
    public double sqcm() {
        return (sqm / CENT);
    }

    @Override
    public double sqm() {
        return sqm;
    }

    @Override
    public double sqkm() {
        return (sqm/KILO);
    }

    @Override
    public Area inverse() {
        return valueOf(-this.sqm);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length div(Length length) {
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
    public int compareTo(Area o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
