package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        rst[bound] = bound * bound;
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(3);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
