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
}