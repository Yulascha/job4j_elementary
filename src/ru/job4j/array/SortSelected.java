package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexOf = FindLoop.indexOf(data, min, index, data.length - 1);
        }
        return data;
    }
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
}
