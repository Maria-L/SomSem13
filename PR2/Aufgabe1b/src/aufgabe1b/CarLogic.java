/*Datum: 28.03.2013
 *Version: 1.0
 *Autor: Steffen Giersch
 *       Maria Lüdemann
 * 
 * Beinhaltet:
 *          Aufgabe1.java
 *          Auto.java
 */
package aufgabe1b;

public class CarLogic extends Aufgabe1b {

    //Beginn Attribute
    private final double mass;          //kg
    private final double powerPropMax;  //W (
    public final double speedMax;       //m/s
    public double level;                //-1..1
    public double time;                 //s
    public double speed;                //m/s
    public double pos;                  //m

    //Ende Attribute
    //Beginn Konstruktoren
    //Ein private Konstruktor damit keiner automatisch generiert wird und von 
    //außen nicht darauf zugegriffen werden kann.
    //
    //Auto ::= (mass, powerPropMax, speedMax) :: Double x Double x Double => Auto
    private CarLogic(double m, double p, double s) {
        mass = m;
        powerPropMax = p * W_TO_KW;
        speedMax = s / KM_TO_MS;
    }

    //Ende Konstruktoren
    //Beginn Methoden
    //Beginn Setter/ Getter
    //set
    //Setzt die Zeit, die Position, die Geschwindigkeit und das Level auf einen 
    //gewünschten Wert
    //
    //set ::= (time, pos, speed, level) :: Double x Double x Double x Double => void
    public void set(double time, double pos, double speed, double level) {
        this.time = time;
        this.pos = pos;
        this.speed = speed / KM_TO_MS;
        this.level = level;
    }
    
    public double getPos() {
        return pos;
    }

    //Ende Setter/ Getter
    //reset
    //Setzt Zeit, Position, Geschwindigkeit und Level auf 0.0
    //
    //reset ::= () :: void => void
    public void reset() {
        this.set(0.0, 0.0, 0.0, 0.0);
    }

    /*Führt einen Bewegungsschritt für das Auto aus und berechnet dafür die benötigten Werte
     * indem es die Maße der DeltaTime bekommt sowie den level als Angabe des Gashebels
     * 
     * step :: (double DeltaTime, double level) Double x Double => void
     * 
     */
    public void step(double deltaTime, double level) {

        //Diskreter  Bewegungsschritt mit alter Geschwindigkeit
        this.pos = pos + (speed * deltaTime);

        //Neuberechnung der Faktoren nach der veränderung des Speeds im vorherigen Step
        double powerProp = Math.abs(level) * powerPropMax;                              //Watt
        double forcePropMax = mass * ACC_EARTH;                                         //N (kg*m^s^-2)
        double forcePropAbs = Math.min(forcePropMax, (powerProp / (Math.abs(speed))));  //N (kg*m^s^-2)
        double forceProp = forcePropAbs * Math.signum(level);                           //N (kg*m^s^-2) Antriebskraft

        double dragConst = Math.abs(powerPropMax / (Math.pow(speedMax, 3)));            // <- todo Reibung
        double forceDrag = dragConst * (Math.pow(speed, 2) * Math.signum(-speed));      //N (kg*m^s^-2)

        double force = forceProp + forceDrag;                                           //Newton

        double acc = force / mass;                                                      //m/s^2     Beschleunigung = Kraft/Masse


        //Neue Berechnung der Geschwindigkeit für den nächsten Step
        this.speed = speed + (acc * deltaTime);                                         //m/s


        this.time = time + deltaTime;                                                   //Sekunde

    }
    /*Ein indirekter Konstruktor der von außen aufgerufen werden kann
     * ohne dass der Konstruktor selbst von außen erreichbar ist. Hiermit kann genau
     * ein vorgefertigtes Auto erzeugt werden-
     * 
     * makeAuto1 ::= () :: void => Auto
     */

    public static CarLogic makeAuto1() {
        CarLogic Porsche = new CarLogic(1445.0, 456.0, 330.0);
        //Angabe im Script von PowerPropMax ist KW, die SI-Einheit aber ist W, heißt 1 KW = 10^3W
        Porsche.set(0.0, 0.0, 5, 1.0);
        return Porsche;
    }

    /*Eine toString um die Ausgabe auf das Auto anzupassen
     * 
     * print ::= () :: void => void
     */
    public void myToString() {
        System.out.println("~~~~~~~~~~~");
        System.out.println("Position                : " + pos + " m");
        System.out.println("Fahrtzeit               : " + time + " s");
        System.out.println("Aktuelle Geschwindigkeit: " + speed + " m/s");

    }
    //Ende Methoden
}
