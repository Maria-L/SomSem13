/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Work extends PhysicsScalar {
    
    public double j();
    public double kj();
    
    public Work inverse();
    public Work add(Work work);
    public Work sub(Work work);
    
    public Work mul(double factor);
    public Work div(double factor);
    public double div(Work work);
    
    public Force div(Length length);
    public Length div(Force force);
    public Power div(TimeDiff time);
    
    
}
