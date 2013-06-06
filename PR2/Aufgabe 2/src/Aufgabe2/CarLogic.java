
package Aufgabe2;

import Interfaces.*;
import static Values.Values.*;


public class CarLogic extends Aufgabe2 {

    //Beginn Attribute
    private final Mass mass;          //kg
    private final Power powerPropMax;  //W (
    public final Speed speedMax;       //m/s
    private TimeDiff time;                //s
    private Speed speed;               //m/s
    private double level;               //-1..1
    private double brakeLevel;          //0..1
    private double pos;                 //m
    private boolean ABS;                //Antiblockiersystem
    private boolean ASR;                //AntiSchlupfRegelung
    private double traction = 1;        //Traktion
    private boolean controll = true;    //Kontrolle  -> Attribut für den Zustand, der Kontrolllosigkeit(slide)

    //Ende Attribute
    
    //Beginn Konstruktoren
    
    //Ein private Konstruktor damit keiner automatisch generiert wird und von 
    //außen nicht darauf zugegriffen werden kann.
    //
    //Auto ::= (mass, powerPropMax, speedMax) :: Double x Double x Double => Auto
    private CarLogic(Mass m, Power p, Speed s) {
        mass = m;
        powerPropMax = p;
        speedMax = s;
    }

    //Ende Konstruktoren
    
    //Beginn Setter/ Getter
    
    //Setzt die Zeit, die Position, die Geschwindigkeit und das Level auf einen 
    //gewünschten Wert
    public void set(TimeDiff time, double pos, Speed speed, double level, boolean controll) {
        this.time = time;
        this.pos = pos;
        this.speed = speed;
        this.level = level;
        this.controll = controll;
    }

    public void setABS(boolean x) {
        ABS = x;
    }

    public void setASR(boolean x) {
        ASR = x;
    }
    
    public void setTraction(Double x) {
        traction = x;
    }
    
    public double getTraction() {
        return this.traction;
    }

    public double getPos() {
        return pos;
    }
    
    public boolean getControll() {
        return controll;
    }

    //Ende Setter/ Getter

    //Setzt Zeit, Position, Geschwindigkeit und Level auf 0.0
    public void reset() {
        this.set(timeDiffInS(0.0), 0.0, speedInKmH(0.0), 0.0, true);
    }

    //Führt einen Bewegungsschritt für das Auto aus und berechnet dafür die benötigten Werte
    // indem es die Maße der DeltaTime bekommt sowie den level als Angabe des Gashebels
    public void step(TimeDiff deltaTime, double level, double brakeLevel) {
        
        if (level > 0.0 && (Math.abs(this.speed.ms()) < EPSILON)) {
            this.speed = speedInMs(1);
        } 

        if (speed.ms() == Double.NaN) {
            speed = speedInMs(0);
        }

        //Diskreter  Bewegungsschritt mit alter Geschwindigkeit
        if (Math.abs(speed.ms()) > EPSILON) {

            this.pos = pos + (speed.ms() * deltaTime.s());

            //Neuberechnung der Faktoren nach der veränderung des Speeds im vorherigen Step
            Power powerProp = powerPropMax.mul(Math.abs(level));                        //Watt
            Force forcePropMax = mass.mul(ACC_EARTH);                                   //N (kg*m^s^-2)

            Force forcePropAbs;
            
            if (ASR) {
                forcePropAbs = forceInN(Math.min(forcePropMax.n(), (powerProp.div(speed)).n()));         //N (kg*m^s^-2)
            } else {                                                                  //N (kg*m^s^-2)
                forcePropAbs = powerProp.div(speed);                                     //speed auf 1 setzen?!?
            }
            
            Force forceBrakeAbs = mass.mul(ACC_EARTH.mul(brakeLevel));
            Force forceProp = forcePropAbs.mul(Math.signum(level));                     //N (kg*m^s^-2) Antriebskraft

            Force dragConst = powerPropMax.div(speedInMs(Math.abs(Math.pow(speedMax.ms(),3))));      // <- todo Reibung
            Force forceDrag = dragConst.mul((Math.pow(speed.ms(),2)*Math.signum(-speed.ms())));//N (kg*m^s^-2)

            Force force;                                                             //Newton
            
            if (ASR) {
                force = forceProp.mul(traction).add(forceDrag);
            } else {
                force = forceProp.add(forceDrag);
            }
            
            Force forceBrake;
            if(ABS) {
                forceBrake = forceBrakeAbs.mul(traction-0.01);
            } else {
                forceBrake = forceBrakeAbs;
            }

            Acc acc = (force.sub(forceBrake)).div(mass);                                //m/s^2     Beschleunigung = Kraft/Masse

            //Neue Berechnung der Geschwindigkeit für den nächsten Step
            this.speed = speed.add(acc.mul(deltaTime));                                   //m/s
            if (this.speed.ms() < EPSILON) {this.speed = speedInMs(0);}                             //Abfangen für den Stopzustand
            
            if((Math.abs(force.div(forcePropMax)) > traction || 
                    Math.abs(forceBrake.div(forcePropMax)) > traction)) {
                controll = false;
            }
        }

          this.time = time.add(deltaTime);                                                //Sekunde

    }
     //Ein indirekter Konstruktor der von außen aufgerufen werden kann
     //ohne dass der Konstruktor selbst von außen erreichbar ist. Hiermit kann genau
     //ein vorgefertigtes Auto erzeugt werden-

    public static CarLogic makeAuto1() {
        CarLogic porsche = new CarLogic(massInKg(1445.0), powerInKw(456.0), speedInKmH(330.0));
        //Angabe im Script von PowerPropMax ist KW, die SI-Einheit aber ist W, heißt 1 KW = 10^3W
        porsche.reset();
        return porsche;
    }

    //Eine toString um die Ausgabe auf das Auto anzupassen
    public void myToString() {
        System.out.println("~~~~~~~~~~~");
        System.out.println("Position                : " + pos + " m");
        System.out.println("Fahrtzeit               : " + time.toString());
        System.out.println("Aktuelle Geschwindigkeit: " + speed.toString());

    }
    //Ende Methoden
}
