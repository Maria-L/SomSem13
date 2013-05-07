package aufgabe1b;

import jgame.*;
import jgame.platform.*;

/**
 *
 * @author Steffen Giersch, Maria Lüdemann
 */
public class JCarEngine extends JGEngine implements Constants {

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
                35, // 35 = frame rate, 35 frames per second
                2); //  2 = frame skip, skip at most 2 frames before displaying a frame again

        for (int i = 0; i < 20; i++) {
            new Bird();
        }

        //defineMedia("media.tbl"); // Load in the media we'll use for the game.
    }
    //Used to animate the text
    double texttimer = 0;

    public void doFrame() {
        moveObjects(
                null,   //object name prefix of objects to move (null means any)
                0);     // object collision ID of objects to move (0 means any)
    }

    public void paintFrame() {
        setColor(JGColor.yellow);

        drawString("Hello World",
                viewWidth() / 2 + 50 * Math.sin(texttimer), //xpos
                viewHeight() / 2 + 50 * Math.cos(texttimer), //ypos
                0 //text alignment; -1 is left-aligned, 0 is centered, 1 is right aligned)
                );
    }
}
