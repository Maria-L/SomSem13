/*Datum: 28.03.2013
 *Version: 1.0
 *Autor: Steffen Giersch
 *       Maria Lüdemann
 * 
 * Beinhaltet:
 *          Aufgabe1.java
 *          Auto.java
 */
package aufgabe.pkg1;

public class Aufgabe1 {
    // Definition der benötigten globalen Konstanten
    public final double ACC_EARTH = 9.81;
    /**
     * Start der Main Methode die auf die Autoklasse zu greift
     */
    public static void main(String[] args) {
      Auto auto1 = Auto.makeAuto1();
   
     while(auto1.speed < auto1.speedMax-1 ){
         auto1.step(1.0, 1.0);
         auto1.myToString();             
     }
    }
}
