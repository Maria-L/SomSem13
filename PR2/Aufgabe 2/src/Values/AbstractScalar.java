/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;
import Interfaces.*;

/**
 *
 * @author Mooni
 */
public abstract class AbstractScalar implements PhysicsScalar {

    @Override
    public boolean isZero() {
        return this.getSI() == 0.0;
    }

    @Override
    public boolean isValid() {
        if(getSI() == Double.NaN ||
                getSI() == Double.NEGATIVE_INFINITY ||
                getSI() == Double.POSITIVE_INFINITY) {
             return false;
        } else {
            return true;
        }
    }
    
    @Override
    public int hashCode() {
        long longBits = Double.doubleToLongBits(getSI());
        return (int) (longBits ^(longBits >>> 32));
    }
    
//    @Override
//    public int compareTo(Object o) {
//        return Double.compare(getSI(), o.getSI());
//    }
    
//    @Override
//    public boolean equals(Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Acc)) return false;
//        return this.compareTo((o.getClass())o) == 0;
//    }

    @Override
    abstract public double getSI();
}
