package org.example;

import org.junit.jupiter.api.Test;

/**
 * Created by khangld5 on Jun 01, 2022
 */
class PCTest {
    @Test
    void thread_test() {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.t.start();
        consumer.t.start();
        System.out.println("Press C to stop");
    }

    @Test
    void thread_test2(){
        Q2 q = new Q2();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.t.start();
        consumer.t.start();
        System.out.println("Done");
    }

}
