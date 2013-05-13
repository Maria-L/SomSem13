package aufgabe1b;

//import java.awt.*;
//import java.awt.event.*;

import interfaces.*;
import jgame.*;
import jgame.platform.*;

/**
 *
 * @author Steffen Giersch, Maria Lüdemann
 */
public class JCarEngine extends JGEngine implements Constants {
    
    //Variables, getter and setter
    
    static double frameTime;
    Car car;

    
    public static double getFrameTime() {
        return frameTime;
    }

    //Methods
    
    
    public JCarEngine(JGPoint size) {
        // This inits the engine as an application.
        initEngine(size.x, size.y);
    }

    @Override
    public void initCanvas() {
        setCanvasSettings(
                40, // width of the canvas in tiles
                30, // height of the canvas in tiles
                16, // width of one tile
                16, // height of one tile
                //    (note: total size = 20*16=320  x  15*16=240)
                null,// foreground colour -> use default colour white
                JGColor.red,// background colour -> use default colour black
                null // standard font -> use default font
                );

    }

    @Override
    public void initGame() {
        setFrameRate(
                60, // 35 = frame rate, 35 frames per second
                2); //  2 = frame skip, skip at most 2 frames before displaying a frame again

        frameTime = System.currentTimeMillis();
        car = new Car();

        //defineMedia("media.tbl"); // Load in the media we'll use for the game.
    }

    public void doFrame() {

        car.gasPressed(getKey(38), getKey(40)); //PfeilOben => Gas geben || PfeilUnten => bremsen
        car.setABS(getKey(39));                 //PfeilLinks => ABS an/aus
        car.setASR(getKey(41));                 //PfeilRechts => ASR an/aus
        moveObjects(
                null,   //object name prefix of objects to move (null means any)
                0);     // object collision ID of objects to move (0 means any)
        
        
        frameTime = System.currentTimeMillis();
    }

//    public void paintFrame() {
//
//    }
    
    
}
