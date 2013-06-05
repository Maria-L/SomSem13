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
public class AngleSpeedInDegS implements AngleSpeed {
    
    //Creation
    private final double degS;
    
    private AngleSpeedInDegS(double degS) {
        this.degS = degS;
    }
    
    public static AngleSpeed valueOf(double degS) {
        return new AngleSpeedInDegS(degS);
    }
    //End Creation
    
    //Getter
    @Override
    public double radS() {
        return (degS / Values.DEGINRAD);
    }

    @Override
    public double degS() {
        return degS;
    }
    //End Getter

    //Methoden
    @Override
    public AngleSpeed inverse() {
        return angleSpeedInDegS(-degS);
    }

    @Override
    public AngleSpeed add(AngleSpeed angleSpeed) {
        return angleSpeedInDegS(this.degS() + angleSpeed.degS());
    }

    @Override
    public AngleSpeed sub(AngleSpeed angleSpeed) {
        return angleSpeedInDegS(this.degS() - angleSpeed.degS());
    }

    @Override
    public AngleSpeed mul(double factor) {
        return angleSpeedInDegS(this.degS() * factor);
    }

    @Override
    public AngleSpeed div(double factor) {
        return angleSpeedInDegS(this.degS() / factor);
    }

    @Override
    public double div(AngleSpeed angleSpeed) {
        return this.degS() / angleSpeed.degS();
    }

    @Override
    public Angle mul(TimeDiff time) {
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
    public int compareTo(AngleSpeed o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
