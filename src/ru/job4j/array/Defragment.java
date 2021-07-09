package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = 0; i < array.length + 1; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i;
                        swap(array, point, notNullIndex);
                        }
                    System.out.print(array[index] + " ");
                    }
                }
            }
        return array;
        }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
