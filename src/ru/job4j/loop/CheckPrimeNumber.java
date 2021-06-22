package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number % 2 == 0) {
            prime = false;
        } else {
            prime = true;
        }
    return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check (4));
        System.out.println(check (1));
    }
}