package aufgabe1b;

import jgame.*;
import jgame.platform.*;

/**
 *
 * @author abl128
 */
public class Bird extends JGObject implements Constants {
    //Constructor

    Bird() {
        super(
                "bird", //name by which the object is known
                true, //true means add a unique ID number after the object name.
                Math.round(Math.random() * PFWIDTH), //xpos
                Math.round(Math.random() * PFHIGHT), //ypos
                1, //collision ID
                null //name of sprite or animation to use - null is none
                );

        xspeed = Math.random() * 2;
        yspeed = Math.random() * 2;
    }

    @Override
    public void move() {
        if (x > PFWIDTH - 8 && xspeed > 0) {
            xspeed = -xspeed;
        }
        if (x < 8 && xspeed < 0) {
            xspeed = -xspeed;
        }
        if (y > PFHIGHT - 8 && yspeed > 0) {
            yspeed = -yspeed;
        }
        if (y < 8 && yspeed < 0) {
            yspeed = -yspeed;
        }
    }
    
    @Override
    public void paint() {
        eng.setColor(JGColor.black);
        eng.drawOval(x,y,16,16,true,true);
    }
}
