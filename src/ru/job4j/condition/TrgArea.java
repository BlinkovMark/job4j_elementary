package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double prsl = (a + b + c) / 2;
        double rsl1 = prsl - a;
        double rsl2 = prsl - b;
        double rsl3 = prsl - c;
        double rsltot = prsl * rsl1 * rsl2 * rsl3;
        double srsl = Math.sqrt(rsltot);
        return srsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}