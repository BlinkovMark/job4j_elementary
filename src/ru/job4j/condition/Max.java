package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean a = first >= second;
        return a ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

        public static int max(int first, int second, int third, int fourth) {
            return max(first, second, max(third, fourth));
    }

    public static void main(String[] args) {
        int result = Max.max(12, 15, 13, 14);
        System.out.println(result);
    }
}