/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Angle extends PhysicsScalar, Comparable <Angle> {
    
    public double rad();
    public double deg();
    
    public Angle inverse();
    public Angle add(Angle angle);
    public Angle sub(Angle angle);
    
    public Angle mul(double factor);
    public Angle div(double factor);
    public double div(Angle angle);
    
    public AngleSpeed div(TimeDiff time);
}
