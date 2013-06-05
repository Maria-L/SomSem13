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
public class AngleSpeedInDegS implements AngleSpeed, Comparable <AngleSpeed>{
    
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
        return angleInDeg(degS() * time.s());
    }

    @Override
    public boolean isZero() {
        return degS() == 0.0;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int compareTo(AngleSpeed o) {
        return(Double.compare(degS(), o.degS()));
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AngleSpeed)) return false;
        return this.compareTo((AngleSpeed)o) == 0;
    }
}
