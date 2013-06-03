/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

/**
 *
 * @author abl128
 */
public interface Constants {
    
    //Video-Properties
    public static final int PFWIDTH = 640;
    public static final int PFHIGHT = 480;
    
    //Physical Constants
    public final double ACC_EARTH   = 9.81;
    public final double KM_TO_MS    = 3.6;
    public final double W_TO_KW     = 1000;
    public final double MS_TO_S     = 1000;
    public final double EPSILON     = 0.0001;
    public final double GFACTOR     = 5;
    
    //Controlls
    public final int GAS        = 'W';
    public final int BRAKE      = 'S';
    public final int ABS        = 'K';
    public final int ASR        = 'L';
    public final int RESET      = 'R';
    
    public final int NORMAL     = 'T';
    public final int ICE        = 'Z';
    public final int SNOW       = 'U';
    public final int RAIN       = 'I';
    
}
