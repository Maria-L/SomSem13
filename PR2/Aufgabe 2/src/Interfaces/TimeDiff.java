/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface TimeDiff extends PhysicsScalar, Comparable <TimeDiff> {
    public double ns();
    public double ms();
    public double s();
    public double m();
    public double h();
    public double d();
    public double week();
    public double month();
    public double year();
    
    public TimeDiff inverse();
    public TimeDiff add(TimeDiff timeDiff);
    public TimeDiff sub(TimeDiff timeDiff);
    
    public TimeDiff mul(double factor);
    public TimeDiff div(double factor);
    public double div(TimeDiff timediff);
    
    public Length mul(Speed speed);
    public Speed mul(Acc acc);
    public Work mul(Power power);
}
