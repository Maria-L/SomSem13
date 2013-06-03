/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface AngleSpeed extends PhysicsScalar, Comparable <AngleSpeed> {
    
    public double rads();
    public double degs();
    
    public AngleSpeed inverse();
    public AngleSpeed add(AngleSpeed anglespeed);
    public AngleSpeed sub(AngleSpeed anglespeed);
    
    
    public AngleSpeed mul(double factor);
    public AngleSpeed div(double factor);
    public double div(AngleSpeed anglespeed);
    
    Angle mul(TimeDiff time);
}
