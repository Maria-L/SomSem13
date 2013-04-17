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

public class Auto extends Aufgabe1 {
    
    //Beginn Attribute
   private final double mass;
   private final double powerPropMax;
   public final double speedMax;
    
   public double level;   
   public double time;
   public double speed;
   public double pos;
    //Ende Attribute
    
    //Beginn Konstruktoren
    //Ein private Konstruktor damit keiner automatisch generiert wird und von 
    //außen nicht darauf zugegriffen werden kann.
    private Auto(double m, double p,double s){
      mass = m;
      powerPropMax = p*1000; 
      speedMax = s/3.6; 
    }
    
    //Ende Konstruktoren
    
    //Beginn Methoden
    //Beginn Setter/ Getter
    
    public void set(double time,double pos,double speed,double level){
        this.time = time;
        this.pos = pos;
        this.speed = speed/3.6; 
        this.level = level;   
    }
    
    //Ende Setter/ Getter

    public void reset(){
        this.set(0.0, 0.0, 0.0, 0.0);
    }
    
    /*Führt einen Bewegungsschritt für das Auto aus und berechnet dafür die benötigten Werte
     * indem es die Maße der DeltaTime bekommt sowie den level als Angabe des Gashebels
     * 
     * step :: (double DeltaTime, double level) Double x Double
     * 
     */
    
    public void step(double deltaTime, double level){
        
      //Diskreter  Bewegungsschritt mit altem speed 
      this.pos = pos + (speed*deltaTime);
      
      //Neuberechnung der Faktoren nach der veränderung des Speeds im vorherigen Step
      double powerProp = Math.abs(level)*powerPropMax;
      double forcePropMax = mass * ACC_EARTH;
      double forcePropAbs = Math.min(forcePropMax,(powerProp/(Math.abs(speed))));
      double forceProp = forcePropAbs * Math.signum(level);
      double dragConst = Math.abs(powerPropMax/(Math.pow(speedMax, 3)));
      double forceDrag = dragConst*(Math.pow(speed, 2)*Math.signum(-speed));
      double force = forceProp + forceDrag;
      double acc = force/mass;
      
      this.time = time + deltaTime;
      
      //Neue Berechnung der Geschwindigkeit für den nächsten Step
      this.speed = speed +(acc*deltaTime);
        
    }
    /*Ein indirekter Konstruktor der von außen aufgerufen werden kann
     * ohne dass der Konstruktor selbst von außen erreichbar ist. Hiermit kann genau
     * ein vorgefertigtes Auto erzeugt werden-
     * 
     */
    
    public static Auto makeAuto1(){
        Auto Porsche = new Auto(1445.0,456.0,330.0);
     //Angabe im Script von PowerPropMax ist KW, die SI-Einheit aber ist W, heißt 1 KW = 10^3W
        Porsche.set(0.0, 0.0, 5,1.0);
        return Porsche;
    }
    
    /*Eine toString um die Ausgabe auf das Auto anzupassen
     * 
     * 
     */
    public void myToString(){
        System.out.println("~~~~~~~~~~~");
        System.out.println("Position                : "+pos);
        System.out.println("Fahrtzeit               : "+time);
        System.out.println("Aktuelle Geschwindigkeit: "+speed);
        
    }
    
    //Ende Methoden
    
}
   