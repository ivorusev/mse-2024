package com.mse.intoduction.sumator;

import com.mse.introductio.sumator.Sumator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SumatorTest {

    @Test
    public void testSumator() {
        int actual = Sumator.sum(2, 2);
        assertEquals(4, actual);
    }
}
