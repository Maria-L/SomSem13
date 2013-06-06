package Aufgabe2;

import jgame.*;
import jgame.platform.*;

public class Car extends JGObject implements Constants {

    CarLogic carlogic = CarLogic.makeAuto1();
    private double level = 0.0;
    private double brakeLevel = 0.0;

    //Constructor
    Car() {
        super(
                "car", //name by which the object is known
                true, //true means add a unique ID number after the object name.
                0, //xpos
                330, //ypos
                1, //collision ID
                null //name of sprite or animation to use - null is none
                );
    }
    //Constructor end

    //Setter
    public void setTraction(Double x) {
        carlogic.setTraction(x);
    }

    public void setNormal(boolean x) {
        if (x) {
            setTraction(1.0);
        }
    }

    public void setIce(boolean x) {
        if (x) {
            setTraction(0.1);
        }
    }

    public void setSnow(boolean x) {
        if (x) {
            setTraction(0.3);
        }
    }

    public void setRain(boolean x) {
        if (x) {
            setTraction(0.7);
        }
    }

    public void setABS(boolean x) {
        carlogic.setABS(x);
    }

    public void setASR(boolean x) {
        carlogic.setASR(x);
    }

    public void reset(boolean x) {
        if (x) {
            carlogic.reset();
        }
    }
    //Setter end

    //Getter
    public double getTraction() {
        return carlogic.getTraction();
    }

    public boolean getControll() {
        return carlogic.getControll();
    }
    
    public double getLevel() {
        return level;
    }
    
    public double getBrakeLevel() {
        return brakeLevel;
    }
    //Getter end

    //Methods
    //Gets a boolean and simulates the time until the gas is pressed to max
    public void gasPressed(boolean gas) {
        if (gas && level < 1) {
            level = level + JCarEngine.getDeltaTime().s();
        } else if (gas) {
            level = 1.0;
        } else if (!gas && level > 0) {
            level = level - JCarEngine.getDeltaTime().s();
        } else {
            level = 0.0;
        }
    }

    //Gets a boolean and simulates the time until the brakes are pressed to max
    public void brakePressed(boolean brake) {
        if (brake && brakeLevel < 1) {
            brakeLevel = brakeLevel + JCarEngine.getDeltaTime().s();
        } else if (brake) {
            brakeLevel = 1.0;
        } else if (!brake && brakeLevel > 0) {
            brakeLevel = brakeLevel - JCarEngine.getDeltaTime().s();
        } else {
            brakeLevel = 0.0;
        }
    }
    //Methods end

    //Engine Methods
    @Override
    public void move() {
        if (!carlogic.getControll()) {
            carlogic.step(JCarEngine.getDeltaTime(), //DeltaTime
                    0, //Level
                    5);   //brakeLevel
        } else {
            carlogic.step(JCarEngine.getDeltaTime(), //DeltaTime
                    level, //Level
                    brakeLevel);   //brakeLevel
        }
        carlogic.myToString();
        x = (carlogic.getPos().m() * GFACTOR) % PFWIDTH;
    }

    @Override
    public void paint() {
        if (carlogic.getControll()) {
            eng.drawImage(x, y, "car");
        } else {
            eng.drawImage(x, y, "car_destroyed");
        }
    }
    //Engine Methods end
}
