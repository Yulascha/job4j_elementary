package ru.job4j;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String idea1 = "But I am a newbie.";
        String separate = " ";
        String idea2 = idea + separate + idea1;
        System.out.println(idea2);
        int year = 2021;
        String idea3 = idea + separate + year;
        System.out.println(idea3);
    }
}
