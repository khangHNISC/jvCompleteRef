package org.example;

/**
 * Created by khangld5 on Jun 01, 2022
 */
class Q2 extends Q {
    boolean valueSet = false;

    @Override
    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    @Override
    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
