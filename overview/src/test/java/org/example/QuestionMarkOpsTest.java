package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by khangld5 on May 23, 2022
 */
class QuestionMarkOpsTest {

    @Test
    void with_assignment(){
        int denom = 19;
        int num = 19;

        int ratio = (denom == 0) ? 0 : num / denom;
        assertEquals(ratio, 1);
    }
}
