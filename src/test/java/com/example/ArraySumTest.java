package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    ArraySum obj = new ArraySum();

    @Test
    public void testSum() {
        int[] arr = {10, 20, 30};
        assertEquals(60, obj.findSum(arr));
    }

    @Test
    public void testSumWithNegative() {
        int[] arr = {-10, 20, 30};
        assertEquals(40, obj.findSum(arr));
    }

    @Test
    public void testSumWithZero() {
        int[] arr = {0, 0, 0};
        assertEquals(0, obj.findSum(arr));
    }
}
