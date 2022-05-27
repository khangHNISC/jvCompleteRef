package org.example;

import org.junit.jupiter.api.Test;

/**
 * Created by khangld5 on May 27, 2022
 */
class ConstructorExecutedTest {
    static class A {
        A() {
            System.out.println("A");
        }

        void show() {
            System.out.println("A show");
        }
    }

    static class B extends A {
        B() {
            System.out.println("B");
        }

        void show() {
            System.out.println("B show");
        }
    }

    @Test
    void order_constructor_execute() {
        A b = new B();
        b.show();
        b = new A();
        b.show();
    }
}
