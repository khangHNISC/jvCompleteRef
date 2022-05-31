package org.example;

/**
 * Created by khangld5 on May 31, 2022
 */
public class Caller implements Runnable {
    String msg;
    final CallMe target;
    Thread t;

    public Caller(CallMe target, String s) {
        this.target = target;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
