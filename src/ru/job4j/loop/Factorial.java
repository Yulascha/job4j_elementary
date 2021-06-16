package ru.job4j.loop;

public class Factorial {
    public static int calc(int n, int n1) {
        int result = 1;
        for (n = 1; n <= n1; n++) {
            result = result * n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(1, 5));
        System.out.println(calc(1, 0));
    }
}
