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

}