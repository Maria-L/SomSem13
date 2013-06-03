/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Acc extends PhysicsScalar {      // in SI m/s^2
    
    public double mss();
    
    public Acc inverse();
    public Acc add(Acc acc);
    public Acc sub(Acc acc);
    
    public Acc mul(double factor);
    public Acc div(double factor);
    public double div(Acc acc);
    
    public Speed mul(TimeDiff time);
    public Force mul(Mass mass);
}
