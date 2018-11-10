/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsSim;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DP
 */
public class Delay extends Thread {
    
    private boolean inDelay = false;
    private long delayTime;
    
    public Delay(long delayTime, String name) {
        super(name);
        this.delayTime = delayTime;
    }
    
    public Delay(long delayTime) {
        this.delayTime = delayTime;
    }
    
    public void makeDelay()
    {
        //System.out.println("#####################################################################");
        try {
            sleep(delayTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(Delay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void makeOtherDelay(long delay)
    {
        //System.out.println("#####################################################################");
        try {
            sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(Delay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public boolean isInDelay() {
        return inDelay;
    }

    public void setInDelay(boolean inDelay) {
        this.inDelay = inDelay;
    }
    
    
    
}
