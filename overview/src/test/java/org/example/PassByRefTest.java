package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 26, 2022
 */
class PassByRefTest {
    @Test
    void passByRef() {
        A a = new A();
        change(a);
        assertEquals(a.val, 1);
    }

    @Test
    void passByValue() {
        A a = new A();
        a.val = 1;
        changeObj(a);
        assertEquals(a.val, 1);
    }

    private void changeObj(A a) {
        a = new A();
    }

    private void change(A a) {
        a.val = 1;
    }

    static class A {
        int val = 0;
    }
}
