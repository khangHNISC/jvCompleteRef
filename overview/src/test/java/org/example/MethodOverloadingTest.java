package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 26, 2022
 */
class MethodOverloadingTest {
    static class Overload {
        void test() {
            System.out.println("no param");
        }

        void test(int a) {
            System.out.println("a :" + a);
        }

        void test(int a, int b) {
            System.out.println("a, b: " + a + ", " + b);
        }

        double test(double a) {
            System.out.println("double a: " + a);
            return a * a;
        }
    }

    @Test
    void test_overload() {
        Overload ob = new Overload();
        ob.test();
        ob.test(10);
        ob.test(1, 2);
        double result = ob.test(123.25);
        assertEquals(result, 15190.5625);
    }
}
