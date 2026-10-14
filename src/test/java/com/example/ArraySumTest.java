package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    @Test
    public void testFindSum() {
        ArraySum obj = new ArraySum();

        int[] arr = {10, 20, 30, 40, 50};

        assertEquals(150, obj.findSum(arr));
    }
}

