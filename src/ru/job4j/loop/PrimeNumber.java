package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = count; number >= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
    }
}
