package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int a = 0; a < rsl.length; a++) {
            if (i > left.length - 1) {
                rsl[a] = right[j];
                j++;
            } else if (j > right.length - 1) {
                rsl[a] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[a]  = left[i];
                i++;
            } else {
                rsl[a] = right[j];
                j++;
            }
        }
        return rsl;
    }
}
