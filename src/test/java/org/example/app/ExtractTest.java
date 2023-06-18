package org.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractTest {

    @Test
    void testExtractElementsAfterFour() {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectedArray = {1, 7};
        int[] resultArray = Extract.extractElementsAfterFour(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testExtractElementsAfterFourOne() {
        int[] inputArray = {4, 4, 4};
        int[] expectedArray = {};
        int[] resultArray = Extract.extractElementsAfterFour(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testExtractElementsAfterFourTwo() {
        int[] inputArray = {1, 2, 3, 7};
        assertThrows(RuntimeException.class, () -> {
            Extract.extractElementsAfterFour(inputArray);
        });
    }
}