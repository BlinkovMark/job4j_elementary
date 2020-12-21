package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char hor = board[row][board.length - 1];
        for (char i = 0; i < board.length; i++) {
            if (hor != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char ver = board[board.length - 1][column];
        for (char i = 0; i < board.length; i++) {
            if (ver != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}