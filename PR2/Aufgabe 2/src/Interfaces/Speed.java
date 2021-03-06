/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Speed extends PhysicsScalar, Comparable <Speed> {
    
    public double ms();
    public double kmh();
    
    public Speed inverse();
    public Speed add(Speed speed);
    public Speed sub(Speed speed);
    
    public Speed mul(double factor);
    public Speed div(double factor);
    public double div(Speed speed);
    
    public Length mul(TimeDiff time);
    public Acc div(TimeDiff time);
    public TimeDiff div(Acc acc);
    public Force dragForce(Speed maxSpeed, Power maxPower);
     
    public String toStringInKmh();
    
}
