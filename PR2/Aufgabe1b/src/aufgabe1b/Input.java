/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1b;

/**
 *
 * @author abl128
 */
public class Input {
    private double gas = 0.0;
    private double brake = 0.0;

    public Input() {
        JCarEngine.pressed(38);
    }

    void setGas(int x) {
        x = jre.keymap[x];
    }
}
