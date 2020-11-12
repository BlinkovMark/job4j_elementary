package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = Math.pow(rsl2, 2);
        double rslpowtot = rsl3 + rsl4; /* сложение возведенного в степень*/
        double rsltot = Math.sqrt(rslpowtot);
        return rsltot;
    }

    public static void main(String[] args) {
        double result = Point.distance(19, 16, 25, 8);
        System.out.println("result (19,16) to (25,8) " + result);
    }
}