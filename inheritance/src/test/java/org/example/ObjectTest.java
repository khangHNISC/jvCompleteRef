package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 27, 2022
 */
class ObjectTest {
    @Test
    void test_equals() {
        Object a = new Object();
        Object b = new Object();
        assertEquals(a.equals(b), false);
    }

    @Test
    void test_toString() {
        Object a = new Object();
        assertEquals(a.getClass(),Object.class);
    }
}
