package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second) {
            result = first;
        } else if (first > third) {
            result = first;
        } else if (second > third) {
            result = second;
        } else {
          result = third;
        }
        return result;
    }
}