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
public class MassInKg implements Mass{
    
    private final double kg;
    
    //Creation
    private MassInKg(double kg){
        this.kg = kg;
    }
    
    public static Mass valueOf(double kg){
        return new MassInKg(kg);
    }
    
    //End Creation
    
    //Getter

    @Override
    public double mg() {
        return kg/MICR;
    }

    @Override
    public double g() {
        return kg/MILI;
    }

    @Override
    public double kg() {
        return kg;
    }

    @Override
    public double t() {
        return kg/KILO;
    }

    @Override
    public Mass inverse() {
        return massInKg(-kg);
    }
    
    //End Getter
    
    //Methods

    @Override
    public Mass add(Mass mass) {
        return massInKg(kg + mass.kg());
    }

    @Override
    public Mass sub(Mass mass) {
        return massInKg(kg - mass.kg());
    }

    @Override
    public Mass mul(double factor) {
        return massInKg(kg * factor);
    }

    @Override
    public Mass div(double factor) {
       return massInKg(kg / factor);
    }

    @Override
    public double div(Mass mass) {
        return (kg / mass.kg());
    }
    
    //

    @Override
    public Force mul(Acc acc) {
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
    public int compareTo(Mass o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
