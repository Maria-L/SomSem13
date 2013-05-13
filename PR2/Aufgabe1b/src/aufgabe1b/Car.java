package aufgabe1b;

import jgame.*;
import jgame.platform.*;

public class Car extends JGObject implements Constants {

    CarLogic carlogic = CarLogic.makeAuto1();
    private double level = 0;
    
    Car() {
        super(
                "car",  //name by which the object is known
                true,   //true means add a unique ID number after the object name.
                0,      //xpos
                50,     //ypos
                1,      //collision ID
                null    //name of sprite or animation to use - null is none
                );

        xspeed = 0;
        //yspeed = 0;
    }
    
    public void gasPressed(boolean gas, boolean brake) {
        if(gas && level < 1) {level = level + ((System.currentTimeMillis() - JCarEngine.getFrameTime())/MS_TO_S);}
        else if(brake && level > -1) {level = level - ((System.currentTimeMillis() - JCarEngine.getFrameTime())/MS_TO_S);}
        else if(brake || gas) {}
        else {level = 0;}
    }
    
    public void setABS(boolean x) {
        carlogic.setABS(x);
    }
    
    public void setASR(boolean x) {
        carlogic.setASR(x);
    }
    
    @Override
    public void move() {
        carlogic.step(((System.currentTimeMillis() - JCarEngine.getFrameTime())/MS_TO_S),    //DeltaTime
                level);         //Level
        carlogic.myToString();
//        System.out.println(System.currentTimeMillis() - JCarEngine.getFrameTime());
        x = carlogic.getPos();
    }
    
    @Override
    public void paint() {
        eng.setColor(JGColor.black);
        eng.drawOval(x,y,16,16,true,true);
    }
}
