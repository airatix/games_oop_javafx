package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return monoHorizontal(board) || monoVertical(board);
    }

    public static boolean monoHorizontal(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            boolean rsl = true;
            for (int cell : board[row]) {
                if (cell != 1) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoVertical(int[][] board) {
        for (int column = 0; column < board.length; column++) {
            boolean rsl = true;
            for (int[] row : board) {
                if (row[column] != 1) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) {
                return true;
            }
        }
        return false;
    }
}
