package ru.job4j.array;

public class Matrix {
    public static int multiple(int[][] size) {
        int result = 0;
        int[][] multiple = new int[row][cell];
        for (int row = 0; row < size.length; row++) {
            for (int cell = 0; cell < size.length; cell++) {
                multiple[row][cell] = (row + 1) * (cell + 1);
                result = multiple[row][cell];
            }
        }
        return result;
    }
}