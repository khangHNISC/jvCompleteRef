package org.example;

import org.junit.jupiter.api.Test;

/**
 * Created by khangld5 on May 26, 2022
 */
class NestedClassTest {
    int outer = 100;

    static class ABC {
        void display() {
            System.out.println("display: outer = " + new NestedClassTest().outer);
        }
    }

    class DEF {
        void display() {
            System.out.println("display: outer = " + outer);
        }
    }

    @Test
    void testDisplay() {
        new ABC().display();
        new DEF().display();
    }
}
