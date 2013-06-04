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
public class VolumeInCbM implements Volume {
    
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
        return cbm/CENT;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length div(Area sqmeters) {
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
    public int compareTo(Volume o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
