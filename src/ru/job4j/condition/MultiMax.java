package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return first;
        } else if (first > third) {
            return first;
        } else if (second > third) {
            return second;
        } else {
            return third;
        }
    }
}