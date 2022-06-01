package org.example;

/**
 * Created by khangld5 on May 31, 2022
 */
public class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
