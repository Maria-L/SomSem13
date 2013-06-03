/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author abl128
 */
public interface Mass {
    
    public double mg();
    public double g();
    public double kg();
    public double t();
   
    
    public Mass inverse();
    public Mass add(Mass mass);
    public Mass sub(Mass mass);
    
    
    public Mass mul(double factor);
    public Mass div(double factor);
    public double div(Mass mass);
    
    public Force mul(Acc acc);
}
