package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 20, 2022
 */
class TypeConversionAndCastingTest {
    @Test
    void widening_conversion() {
        int x = (byte) 12;
        int y = (short) 12;

        assertEquals(x, 12);
        assertEquals(y, 12);
    }

    @Test
    void narrowing_conversion() {
        int a = 256;
        byte b = (byte) a;

        assertEquals(b, 0);


    }

    @Test
    void truncation() {
        double d = 323.142;
        assertEquals((int) d, 323);
    }

    @Test
    void auto_promote_expression() {
        byte a = 40;
//        byte b = a * 2; error since a * 2 auto cast to int
        byte b = (byte) (a * 2);
        assertEquals(b, 80);
    }
}
