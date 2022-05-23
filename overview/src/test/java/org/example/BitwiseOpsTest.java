package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 20, 2022
 */
class BitwiseOpsTest {
    @Test
    void not() {
        int i = 0B1010;
        assertEquals(i, 10);
        // 2 complement = -10 -> flip bit = -10 - 1
        assertEquals(~i, -11);
    }

    @Test
    void leftShift() {
        int i = 0b1000000;
        assertEquals(i, 64);
        assertEquals(i << 2, 256);

        byte a = 64;
        //0b1111111 = 127 max byte
        a = (byte) (a << 2);
        assertEquals(a, 0);
    }

    @Test
    void rightShift() {
        //shift -1 1 always result -1
        assertEquals(-1 >> 1, -1);
        //divide by 2 and discard remainder
        assertEquals(35 >> 2, 8);
    }

    @Test
    void unsignedRightShift() {
         assertEquals(-1 >>> 24, 255);
    }
}
