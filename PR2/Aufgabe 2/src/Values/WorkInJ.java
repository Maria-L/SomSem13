/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values;

import Interfaces.*;
import static Values.Values.*;

/**
 *
 * @author abl128
 */
public class WorkInJ implements Work {
    
    private final double j;
    
    //Creation
    
    private WorkInJ (double j){
        this.j = j;
    }
    
    public static Work valueOf(double j){
        return new WorkInJ(j);
    }
    //End Creation
    
    //Getter

    @Override
    public double j() {
        return j;
    }

    @Override
    public double kj() {
        return j/KILO;
    }

    @Override
    public Work inverse() {
        return workInJ(-j);
    }
    
    // End Getter
    
    //Methods

    @Override
    public Work add(Work work) {
        return workInJ(j + work.j());
    }

    @Override
    public Work sub(Work work) {
        return workInJ(j - work.j);
    }

    @Override
    public Work mul(double factor) {
        return workInJ(j* factor);
    }

    @Override
    public Work div(double factor) {
        return workInJ(j / factor);
    }

    @Override
    public double div(Work work) {
        return (j/work.j());
    }
    
    

    @Override
    public Force div(Length length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Length div(Force force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Power div(TimeDiff time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isZero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Work o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
