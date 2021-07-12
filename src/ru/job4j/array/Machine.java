package ru.job4j.array;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (money > 0) {
                size = (money - price) / coins[];
                money++;
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
