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
                JGColor.white,// background colour -> use default colour black
                null // standard font -> use default font
                );

    }

    @Override
    public void initGame() {
        setFrameRate(
                60, // 35 = frame rate, 35 frames per second
                2); //  2 = frame skip, skip at most 2 frames before displaying a frame again
        defineImage("car", "-", 1, "car.png", "-");
        defineImage("background", "-", 1, "background.png", "-");
        
        setBGImage("background");
        frameTime = System.currentTimeMillis();
        car = new Car();

        //defineMedia("media.tbl"); // Load in the media we'll use for the game.
    }

    public void doFrame() {

        car.gasPressed(getKey(GAS));             //PfeilOben => Gas geben
        car.setABS(getKey(ABS));                 //PfeilLinks => ABS an/aus
        car.setASR(getKey(ASR));                 //PfeilRechts => ASR an/aus
        car.brakePressed(getKey(BRAKE));         //B => Bremsen
        car.setNormal(getKey(NORMAL));
        car.setIce(getKey(ICE));
        car.setSnow(getKey(SNOW));
        car.setRain(getKey(RAIN));

        moveObjects(
                null, //object name prefix of objects to move (null means any)
                0);     // object collision ID of objects to move (0 means any)


        frameTime = System.currentTimeMillis();
    }

    public void paintFrame() {
        setColor(JGColor.white);
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
        
        if (car.getControll())  {drawString("Unter Kontrolle", 0, 0, -1);}
        else                    {drawString("Keine Kontrolle", 0, 0, -1);}
        
        if (car.getTraction() == 1.0) {drawString("Traktion: Normal", 0, 460, -1);}
        if (car.getTraction() == 0.1) {drawString("Traktion: Eis", 0, 460, -1);}
        if (car.getTraction() == 0.3) {drawString("Traktion: Schnee", 0, 460, -1);}
        if (car.getTraction() == 0.7) {drawString("Traktion: Nässe", 0, 460, -1);}

    }
}
