package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (char.startsWith(word, pref)) {
            return true;
        } else {
            return false;
        }
        return result;
    }
}
