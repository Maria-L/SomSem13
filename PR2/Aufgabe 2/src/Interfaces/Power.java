/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Power extends PhysicsScalar {
    
    public double w();
    public double kw();
    
    public Power inverse();
    public Power add(Power power);
    public Power sub(Power power);
    
    public Power mul(double factor);
    public Power div(double factor);
    public double div(Power power);
    
    public Work mul(TimeDiff time);
    public Force div(Speed speed);
    
}
