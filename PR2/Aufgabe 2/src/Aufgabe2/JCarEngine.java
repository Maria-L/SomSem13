package Aufgabe2;

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
    static double deltaTime;
    static double fps;
    Car car;

//    public static double getFrameTime() {
//        return frameTime;
//    }
    
    public static double getDeltaTime() {
        return deltaTime;
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
                JGColor.white,// background colour -> use default colour black
                null // standard font -> use default font
                );
    }

    @Override
    public void initGame() {
        setFrameRate(
                60, // 60 = frame rate, 60 frames per second
                2); //  2 = frame skip, skip at most 2 frames before displaying a frame again
        
        defineImage("car", "-", 1, "car.png", "-");
        defineImage("car_destroyed", "-", 1, "car_destroyed.png", "-");
        defineImage("background", "-", 1, "background.png", "-");
        
        setBGImage("background");
        car = new Car();
        frameTime = System.currentTimeMillis();
    }

    public void doFrame() {

        //Give UserInput to the car which gives it to the carlogic
        car.gasPressed(getKey(GAS));    //W => Gas
        car.setABS(getKey(ABS));        //K => ABS on/off
        car.setASR(getKey(ASR));        //L => ASR on/off
        car.brakePressed(getKey(BRAKE));//S => Brakes
        car.reset(getKey(RESET));       //R => Reset
        car.setNormal(getKey(NORMAL));  //T => Normal traction
        car.setIce(getKey(ICE));        //Z => Ice traction
        car.setSnow(getKey(SNOW));      //U => Snow traction
        car.setRain(getKey(RAIN));      //I => Rain traction

        //Call the move funktions of all registered objects - only car
        moveObjects(
                null, //object name prefix of objects to move (null means any)
                0);     // object collision ID of objects to move (0 means any)

        //refresh time of the current frame
        deltaTime = (System.currentTimeMillis() - frameTime) / MS_TO_S;
        frameTime = System.currentTimeMillis();
        fps = 1/deltaTime;
    }

    //Calls the paint funktion of every registered object (car)
    public void paintFrame() {
        //Set the color of all the text displayed in the picture to white
        setColor(JGColor.white);
        //Draws the status of the ABS, ASR, Traction and the controll in the picture
        if (getKey(ABS)) {
            drawString("ABS an", 0, 420, -1);
        } else {
            drawString("ABS aus", 0, 420, -1);
        }
        
        if (getKey(ASR)) {
            drawString("ASR an", 0, 440, -1);
        } else {
            drawString("ASR aus", 0, 440, -1);
        }
        
        if (car.getTraction() == 1.0) {drawString("Traktion: Normal", 0, 460, -1);}
        if (car.getTraction() == 0.1) {drawString("Traktion: Eis", 0, 460, -1);}
        if (car.getTraction() == 0.3) {drawString("Traktion: Schnee", 0, 460, -1);}
        if (car.getTraction() == 0.7) {drawString("Traktion: Nässe", 0, 460, -1);}

    }
}
