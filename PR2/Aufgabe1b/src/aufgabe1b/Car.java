package aufgabe1b;

import jgame.*;
import jgame.platform.*;

public class Car extends JGObject implements Constants {

    CarLogic carlogic = CarLogic.makeAuto1();
    
    Car() {
        super(
                "car",  //name by which the object is known
                true,   //true means add a unique ID number after the object name.
                0,      //xpos
                50,      //ypos
                1,      //collision ID
                null    //name of sprite or animation to use - null is none
                );

        xspeed = 0;
        yspeed = 0;
    }
    
    @Override
    public void move() {
        carlogic.step(1,1);     //TODO -> Deltatime usw
        x = carlogic.getPos();
    }
    
    @Override
    public void paint() {
        eng.setColor(JGColor.black);
        eng.drawOval(x,y,16,16,true,true);
    }
}
