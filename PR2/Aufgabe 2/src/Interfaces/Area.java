/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Area extends PhysicsScalar, Comparable <Area> {
    
    public double sqcm();
    public double sqm();
    public double sqkm();
    
    public Area inverse();
    public Area add(Area area);
    public Area sub(Area area);
    
    public Area mul(double factor);
    public Area div(double factor);
    public double div(Area area);
    
    public Volume mul(Length length);
    public Length div(Length length);
}
