package org.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {
    private SimpleMathLibrary mathLibrary;

    @BeforeEach
    public void setUp() {
        mathLibrary = new SimpleMathLibrary();
    }

    @Test
    void testAdd() {
        double result = mathLibrary.add(2.5, 3.5);
        assertEquals(6.0, result, 0.0001);
        if (result == 6.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    void testMinus() {
        double result = mathLibrary.minus(5.0, 2.0);
        assertEquals(3.0, result, 0.0001);
        if (result == 3.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    void testExtractElementsAfterFour() {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectedArray = {1, 7};
        int[] resultArray = SimpleMathLibrary.extractElementsAfterFour(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testExtractElementsAfterFourOne() {
        int[] inputArray = {4, 4, 4};
        int[] expectedArray = {};
        int[] resultArray = SimpleMathLibrary.extractElementsAfterFour(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testExtractElementsAfterFourTwo() {
        int[] inputArray = {1, 2, 3, 7};
        assertThrows(RuntimeException.class, () -> {
            SimpleMathLibrary.extractElementsAfterFour(inputArray);
        });
    }

    @Test
    void testCheckArrayComposition() {
        int[] array = {1, 1, 1, 4, 4, 1, 4};
        assertTrue(SimpleMathLibrary.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionOne() {
        int[] array = {4, 4, 4};
        assertFalse(SimpleMathLibrary.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionTow() {
        int[] array = {1, 1, 1, 1};
        assertFalse(SimpleMathLibrary.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionThree() {
        int[] array = {1, 1, 1, 4, 4, 1, 3};
        assertFalse(SimpleMathLibrary.checkArrayComposition(array));
    }
}