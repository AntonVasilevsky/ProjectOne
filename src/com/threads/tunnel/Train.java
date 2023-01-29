package com.threads.tunnel;

import com.geometry.CurrentDate;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Train {
    private Timer birth;
    private boolean passedTunnel;


    public void startTimer(){
        birth = new Timer();
        birth.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
                birth.cancel();

            }
        }, 2000);
    }

    public boolean isPassedTunnel() {
        return passedTunnel;
    }

    public void setPassedTunnel(boolean passedTunnel) {
        this.passedTunnel = passedTunnel;
    }
}
