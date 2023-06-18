package org.example.app;

public class CheckArray {
    public static boolean checkArrayComposition(int[] array) {
        boolean containsOne = false;
        boolean containsFour = false;
        boolean containsOthers = false;
        for (int num : array) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            } else {
                containsOthers = true;

            }
        }
        return containsOne && containsFour && !containsOthers;
    }
}
