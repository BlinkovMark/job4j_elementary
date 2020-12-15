package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int i : left) {
            if (i == right[right.length - 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}