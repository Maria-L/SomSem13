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
    public double rads() {
        return (degS / Values.DEGINRAD);
    }

    @Override
    public double degs() {
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
        return angleSpeedInDegS(this.degs() + angleSpeed.degs());
    }

    @Override
    public AngleSpeed sub(AngleSpeed angleSpeed) {
        return angleSpeedInDegS(this.degs() - angleSpeed.degs());
    }

    @Override
    public AngleSpeed mul(double factor) {
        return angleSpeedInDegS(this.degs() * factor);
    }

    @Override
    public AngleSpeed div(double factor) {
        return angleSpeedInDegS(this.degs() / factor);
    }

    @Override
    public double div(AngleSpeed angleSpeed) {
        return this.degs() / angleSpeed.degs();
    }

    @Override
    public Angle mul(TimeDiff time) {
        return angleInDeg(degs() * time.s());
    }

    @Override
    public boolean isZero() {
        return degs() == 0.0;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int compareTo(AngleSpeed o) {
        return(Double.compare(degs(), o.degs()));
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AngleSpeed)) return false;
        return this.compareTo((AngleSpeed)o) == 0;
    }
}
