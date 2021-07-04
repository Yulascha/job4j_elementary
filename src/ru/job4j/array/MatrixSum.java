package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int result = i + array.length;
        }
        return result;
    }
}
