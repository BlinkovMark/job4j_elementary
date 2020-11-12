package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short mheight) {
        double rsl = (mheight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short wheight) {
        double rsl = (wheight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short mheight = 184;
        short wheight = 168;
        double man = Fit.manWeight(mheight);
        double woman = Fit.womanWeight(wheight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 168 is " + woman);
    }
}