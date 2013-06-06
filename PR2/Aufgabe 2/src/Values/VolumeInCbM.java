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
public class VolumeInCbM implements Volume, Comparable <Volume> {
    
    private final double cbm;
    
    //Creation
    private VolumeInCbM(double cbm){
        this.cbm = cbm;
    }
    
    public static Volume valueOf(double cbm){
        return new VolumeInCbM(cbm);
    }
    //End Creation
    
    //Getter

    @Override
    public double cubcm() {
        return cbm/Math.pow(CENT,3);
    }

    @Override
    public double cubm() {
        return cbm;
    }

    @Override
    public Volume inverse() {
        return volumeInCbM(-cbm);
    }
    
    //End Getter
    
    // Methods

    @Override
    public Volume add(Volume volume) {
        return volumeInCbM(cbm + volume.cubm());
    }

    @Override
    public Volume sub(Volume volume) {
        return volumeInCbM(cbm - volume.cubm());
    }

    @Override
    public Volume mul(double factor) {
        return volumeInCbM(cbm * factor);
    }

    @Override
    public Volume div(double factor) {
       return volumeInCbM(cbm / factor);
    }
    
    //

    @Override
    public double div(Volume volume) {
        return (cbm / volume.cubm());
    }

    @Override
    public Area div(Length length) {
        return areaInSqM(cbm/length.m());
    }

    @Override
    public Length div(Area sqmeters) {
     return lengthInM(cbm/sqmeters.sqm());
    }

    @Override
    public boolean isZero() {
        return cbm == 0.0;
    }

    @Override
    public boolean isValid() {
        return cubm() >= 0.0;
    }

    @Override
    public int compareTo(Volume o) {
        return Double.compare(cbm, o.cubm());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Volume)) return false;
        return this.compareTo((Volume)o) == 0;
    }
}
