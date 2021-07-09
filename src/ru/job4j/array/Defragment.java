package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
            }
            System.out.print(array[index] + " ");
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                int notNullIndex = index;
                swap(array, nullIndex, notNullIndex);
            }
            System.out.print(array[index] + " ");
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
