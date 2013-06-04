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
public class AngleInDeg implements Angle {
    
    //Variablen
    
    private final double degree;
    
    // Creation
    private AngleInDeg(double degree){
        this.degree = degree;
    }
    
    public static Angle valueOf(double degree){
        return new AngleInDeg(degree);
    }
    // End Creation
    
    // Getter

    @Override
    public double rad() {
        return (degree /DEGINRAD);
    }

    @Override
    public double deg() {
        return degree;
    }

    @Override
    public Angle inverse() {
        return valueOf(-this.degree);
    }
    // End Getter
    
    // Methods

    @Override
    public Angle add(Angle angle) {
        return angleInDeg(this.degree + angle.deg());
    }

    @Override
    public Angle sub(Angle angle) {
        return angleInDeg(this.degree - angle.deg());
    }

    @Override
    public Angle mul(double factor) {
        return angleInDeg(this.degree * factor);
    }

    @Override
    public Angle div(double factor) {
        return angleInDeg(this.degree / factor);
    }

    @Override
    public double div(Angle angle) {
        return (this.degree / angle.deg());
    }
    
    

    @Override
    public AngleSpeed div(TimeDiff time) {
        return angleSpeedInDeg(degree/ time.s());
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
    public int compareTo(Angle o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
