package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int result = switch (name) { /* or "return switch (name) { */
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> 0;
        };
        return result;
    }

    public static void main(String[] args) {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        System.out.println(result);
        result = MultipleSwitchWeek.numberOfDay("Thursday");
        System.out.println(result);
        result = MultipleSwitchWeek.numberOfDay("Hello");
        System.out.println(result);
    }
}