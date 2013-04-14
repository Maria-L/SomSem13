/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe.pkg1;

/**
 *
 * @author Mooni
 */
public class Aufgabe1 {
    // Definition der benötigten globalen Konstanten
    public final double ACC_EARTH = 9.81;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Auto auto1 = Auto.makeAuto1();
   
     while(auto1.speed < auto1.speedMax-1 ){
         auto1.step(1.0, 1.0);
         auto1.myToString();             
     }
    }
}
