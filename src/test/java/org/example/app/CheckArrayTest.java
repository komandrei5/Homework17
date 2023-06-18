package org.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayTest {

    @Test
    void testCheckArrayComposition() {
        int[] array = {1, 1, 1, 4, 4, 1, 4};
        assertTrue(CheckArray.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionOne() {
        int[] array = {4, 4, 4};
        assertFalse(CheckArray.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionTow() {
        int[] array = {1, 1, 1, 1};
        assertFalse(CheckArray.checkArrayComposition(array));
    }

    @Test
    void testCheckArrayCompositionThree() {
        int[] array = {1, 1, 1, 4, 4, 1, 3};
        assertFalse(CheckArray.checkArrayComposition(array));
    }
}