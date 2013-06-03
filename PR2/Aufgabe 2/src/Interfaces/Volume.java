/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Volume extends PhysicsScalar {
    
    public double cubcm();
    public double cubm();
    
    public Volume inverse();
    public Volume add(Volume volume);
    public Volume sub(Volume volume);
    
    public Volume mul(double factor);
    public Volume div(double factor);
    public double div(Volume volume);
    
    public Area div(Length length);
    public Length div(Area sqmeters);    
}
