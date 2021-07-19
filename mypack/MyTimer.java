/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import mypack.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Mansi
 */
public class MyTimer {
     private Timer timer;
    private Display display;    
    private String snapshot;

    public MyTimer(Integer seconds) {
        timer = new Timer();
        long msec = 1000;
        display = new Display();
        timer.scheduleAtFixedRate(new MyTask(), 0*msec, seconds*msec);
        display.insert("Timer is started.");
    }

    private class MyTask extends TimerTask {
        @Override
        public void run() {
            // task to do
            display.insert("New event.");
        }
    }
    public void timerStopped() {
        timer.cancel();
        display.insert("Timer has stopped.");
    }   
    public String getSnapshot() {
        snapshot=display.getDisplay();
        return snapshot;
    }
}