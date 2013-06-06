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
public class AccInMss extends AbstractScalar implements Acc, Comparable <Acc> {

    
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
    
    public double getSI() {
        return mss();
    }
    
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
    public int compareTo(Acc o) {
        return Double.compare(mss(), o.mss());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Acc)) return false;
        return this.compareTo((Acc)o) == 0;
    }
}
