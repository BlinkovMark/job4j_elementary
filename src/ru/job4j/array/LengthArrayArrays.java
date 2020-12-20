package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{5}, {8, 2}, {1, 9, 3}, {10, 20, 30, 40}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
    }
}