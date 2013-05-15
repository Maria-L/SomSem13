
package aufgabe1b;

public class CarLogic extends Aufgabe1b {

    //Beginn Attribute
    private final double mass;          //kg
    private final double powerPropMax;  //W (
    public final double speedMax;       //m/s
    private double level;               //-1..1
    private double brakeLevel;          //0..1
    private double time;                //s
    private double speed;               //m/s
    private double pos;                 //m
    private boolean ABS;                //Antiblockiersystem
    private boolean ASR;                //AntiSchlupfRegelung
    private double traction = 1;        //Traktion
    private boolean controll = true;    //Kontrolle 

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
    
    //Beginn Setter/ Getter
    
    //Setzt die Zeit, die Position, die Geschwindigkeit und das Level auf einen 
    //gewünschten Wert
    public void set(double time, double pos, double speed, double level, boolean controll) {
        this.time = time;
        this.pos = pos;
        this.speed = speed / KM_TO_MS;
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
        this.set(0.0, 0.0, 0.0, 0.0, true);
    }

    //Führt einen Bewegungsschritt für das Auto aus und berechnet dafür die benötigten Werte
    // indem es die Maße der DeltaTime bekommt sowie den level als Angabe des Gashebels
    public void step(double deltaTime, double level, double brakeLevel) {

        if (level > 0.0 && (Math.abs(this.speed) < EPSILON)) {
            this.speed = 1;
        } 

        if (speed == Double.NaN) {
            speed = 0.0;
        }

        //Diskreter  Bewegungsschritt mit alter Geschwindigkeit
        if (Math.abs(speed) > EPSILON) {

            this.pos = pos + (speed * deltaTime);

            //Neuberechnung der Faktoren nach der veränderung des Speeds im vorherigen Step
            double powerProp = Math.abs(level) * powerPropMax;                        //Watt
            double forcePropMax = mass * ACC_EARTH;                                   //N (kg*m^s^-2)

            double forcePropAbs;
            
            if (ASR) {
                forcePropAbs = Math.min(forcePropMax, (powerProp / (speed)));         //N (kg*m^s^-2)
            } else {                                                                  //N (kg*m^s^-2)
                forcePropAbs = powerProp / speed;                                     //speed auf 1 setzen?!?
            }
            
            double forceBrakeAbs = mass * ACC_EARTH * brakeLevel;
            double forceProp = forcePropAbs * Math.signum(level);                     //N (kg*m^s^-2) Antriebskraft

            double dragConst = Math.abs(powerPropMax / (Math.pow(speedMax, 3)));      // <- todo Reibung
            double forceDrag = dragConst * (Math.pow(speed, 2) * Math.signum(-speed));//N (kg*m^s^-2)

            double force;                                                             //Newton
            
            if (ASR) {
                force = forceProp * traction + forceDrag;
            } else {
                force = forceProp + forceDrag;
            }
            
            double forceBrake;
            if(ABS) {
                forceBrake = forceBrakeAbs * (traction-0.01);
            } else {
                forceBrake = forceBrakeAbs;
            }

            double acc = (force - forceBrake) / mass;;                                //m/s^2     Beschleunigung = Kraft/Masse

            //Neue Berechnung der Geschwindigkeit für den nächsten Step
            this.speed = speed + (acc * deltaTime);                                   //m/s
            if (this.speed < 0) {this.speed = 0;}
            
            if(!(Math.abs(force / forcePropMax) <= traction && 
                    Math.abs(forceBrake / forcePropMax) <= traction)) {
                controll = false;
            }
        }

          this.time = time + deltaTime;                                                //Sekunde

    }
     //Ein indirekter Konstruktor der von außen aufgerufen werden kann
     //ohne dass der Konstruktor selbst von außen erreichbar ist. Hiermit kann genau
     //ein vorgefertigtes Auto erzeugt werden-

    public static CarLogic makeAuto1() {
        CarLogic porsche = new CarLogic(1445.0, 456.0, 330.0);
        //Angabe im Script von PowerPropMax ist KW, die SI-Einheit aber ist W, heißt 1 KW = 10^3W
        porsche.set(0.0, 0.0, 0.0, 0.0, true);
        return porsche;
    }

    //Eine toString um die Ausgabe auf das Auto anzupassen
    public void myToString() {
        System.out.println("~~~~~~~~~~~");
        System.out.println("Position                : " + pos + " m");
        System.out.println("Fahrtzeit               : " + time + " s");
        System.out.println("Aktuelle Geschwindigkeit: " + speed + " m/s");

    }
    //Ende Methoden
}
