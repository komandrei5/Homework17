package org.example.app;

public class Extract {
    public static int[] extractElementsAfterFour(int[] inputArray) {
        int lastFourIndes = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 4) {
                lastFourIndes = i;
            }
        }

        if (lastFourIndes == -1) {
            throw  new RuntimeException("Input array must contain at least one 4");
        }

        int[] result = new int[inputArray.length - lastFourIndes - 1];
        System.arraycopy(inputArray, lastFourIndes + 1, result, 0, result.length);

        return result;
    }
}
