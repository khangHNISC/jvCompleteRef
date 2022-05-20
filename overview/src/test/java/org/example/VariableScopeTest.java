package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 20, 2022
 */
class VariableScopeTest {
    @Test
    void test_scope_inside_block() {
        int x;
        x = 10;

        if (x == 10) {
            //outer scope will be visible but not vice versa
            int y = 20;
            x = y * 2;
        }
        //y is unknown
        assertEquals(x, 40);
    }
}
