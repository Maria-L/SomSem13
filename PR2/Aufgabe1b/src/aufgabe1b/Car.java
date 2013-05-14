package aufgabe1b;

import jgame.*;
import jgame.platform.*;

public class Car extends JGObject implements Constants {

    CarLogic carlogic = CarLogic.makeAuto1();
    private double level = 0.0;
    private double brakeLevel = 0.0;

    Car() {
        super(
                "car", //name by which the object is known
                true, //true means add a unique ID number after the object name.
                0, //xpos
                330, //ypos
                1, //collision ID
                null //name of sprite or animation to use - null is none
                );

        xspeed = 0;
        //yspeed = 0;
    }

    public void gasPressed(boolean gas) {
        if (gas && level < 1) {
            level = level + ((System.currentTimeMillis() - JCarEngine.getFrameTime()) / MS_TO_S);
        } else if (gas) {
            level = 1.0;
        } else {
            level = 0.0;
        }
    }

    public void brakePressed(boolean brake) {
        if (brake && brakeLevel < 1) {
            brakeLevel = brakeLevel + ((System.currentTimeMillis() - JCarEngine.getFrameTime()) / MS_TO_S);
        } else if (brake) {
            brakeLevel = 1.0;
        } else {
            brakeLevel = 0.0;
        }
    }
    
    public void setTraction(Double x) {
        carlogic.setTraction(x);
    }
    
    public double getTraction() {
        return carlogic.getTraction();
    }
    
    public boolean getControll() {
        return carlogic.getControll();
    }
    
    public void setNormal(boolean x) {
        if(x) {setTraction(1.0);}
    }
    
    public void setIce(boolean x) {
        if(x) {setTraction(0.1);}
    }
    
    public void setSnow(boolean x) {
        if(x) {setTraction(0.3);}
    }
    
    public void setRain(boolean x) {
        if(x) {setTraction(0.7);}
    }

    public void setABS(boolean x) {
        carlogic.setABS(x);
    }

    public void setASR(boolean x) {
        carlogic.setASR(x);
    }

    @Override
    public void move() {
        if(!carlogic.getControll()) {
            carlogic.step(((System.currentTimeMillis() - JCarEngine.getFrameTime()) / MS_TO_S), //DeltaTime
                0, //Level
                5);   //brakeLevel
        }
        
        carlogic.step(((System.currentTimeMillis() - JCarEngine.getFrameTime()) / MS_TO_S), //DeltaTime
                level, //Level
                brakeLevel);   //brakeLevel
        carlogic.myToString();
//        System.out.println(System.currentTimeMillis() - JCarEngine.getFrameTime());
        x = (carlogic.getPos()) % PFWIDTH;
    }

    @Override
    public void paint() {
        eng.drawImage(x,y, "car");
    }
}
