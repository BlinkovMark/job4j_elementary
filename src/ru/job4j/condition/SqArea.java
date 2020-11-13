package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double hrsl1 = k + 1;
        double hrsl2 = 2 * hrsl1;
        double htot = p / hrsl2;
        double lrsl = htot * k;
        double srsl = lrsl * htot;
        return srsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}