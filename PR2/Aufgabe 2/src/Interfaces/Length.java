/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Length extends PhysicsScalar {
    
    public double ft();
    public double m();
    public double km();
    public double dm();
    public double cm();
    public double mm();
    
    public Length inverse();
    public Length add(Length length);
    public Length sub(Length length);
    
    public Length mul(double factor);
    public Length div(double factor);
    public double div(Length length);
    
    public Area mul(Length length);
    public TimeDiff div(Speed speed);
    public Speed div(TimeDiff time);
    public Work mul(Force force);
}
