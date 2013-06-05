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
public class AccInMss implements Acc {

    
    //Variablen
    
    private final double mss;
    
    //Creation
    private AccInMss(double mss) {
        this.mss = mss;
    }
    
    public static AccInMss valueOf(double mss) {
            return new AccInMss(mss);
    }
    //End Creation
    
    //Getter
    
    @Override
    public double mss() {
        return mss;
    }

    @Override
    public Acc inverse() {
        return accInMss(-mss);
    }
    //End Getter
    
    //Methods

    @Override
    public Acc add(Acc acc) {
        return accInMss(this.mss() + acc.mss());
    }

    @Override
    public Acc sub(Acc acc) {
        return accInMss(this.mss() - acc.mss());
    }

    @Override
    public Acc mul(double factor) {
        return accInMss(this.mss() * factor);
    }

    @Override
    public Acc div(double factor) {
        return accInMss(this.mss() / factor);
    }

    @Override
    public double div(Acc acc) {
        return this.mss() / acc.mss();
    }
    
    //######

    @Override
    public Speed mul(TimeDiff time) {
        return speedInMs(this.mss() * time.s());
    }

    @Override
    public Force mul(Mass mass) {
        return forceInN(this.mss() * mass.kg());
    }

    @Override
    public boolean isZero() {
        return mss() == 0.0;
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Acc o) {
        return Double.compare(o.mss(), mss());
    }
    
}
