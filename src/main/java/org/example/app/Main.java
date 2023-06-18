package org.example.app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleMathLibrary math = new SimpleMathLibrary();

        double sum = math.add(5.4, 7);
        System.out.println("Sum: " + sum);

        double  difference = math.minus(7.55,3);
        System.out.println("Difference: " + difference);

        int[] inputArray = {1, 2, 4, 8, 4, 2, 4, 1, 7, 9};
        int[] resultArray = Extract.extractElementsAfterFour(inputArray);
        System.out.println("Result: " + Arrays.toString(resultArray));

        int[] array = {1, 4};
        boolean y = CheckArray.checkArrayComposition(array);
        System.out.println("Result: " + y);


    }
}
