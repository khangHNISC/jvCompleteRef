package org.example;

/**
 * Created by khangld5 on May 31, 2022
 */
public class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("] ");
    }
}
