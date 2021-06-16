package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 1;
        int n1 = 5;
        int result = Factorial.calc(n, n1);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 1;
        int n1 = 0;
        int result = Factorial.calc(n, n1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
