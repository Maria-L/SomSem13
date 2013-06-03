/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Force {
    
    public double j();
    public double kj();

    
    public Force inverse();
    public Force add(Force force);
    public Force sub(Force force);
    
    
    public Force mul(double factor);
    public Force div(double factor);
    public double div(Force force);
    
    public Mass div(Acc acc);
    public Acc div(Mass mass);
    public Work mul(Length length);

    
}
