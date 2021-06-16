package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = ThreeMax.max(10, 5, 1);
        System.out.println(result);
        int result1 = ThreeMax.max(10, 50, 1);
        System.out.println(result1);
        int result2 = ThreeMax.max(1, 5, 100);
        System.out.println(result2);
        int result3 = ThreeMax.max(1, 1, 1);
        System.out.println(result3);
        int result4 = ThreeMax.max(10, 10, 1);
        System.out.println(result4);
        int result5 = ThreeMax.max(100, 1, 100);
        System.out.println(result5);
        int result6 = ThreeMax.max(1, 100, 100);
        System.out.println(result6);
    }
}