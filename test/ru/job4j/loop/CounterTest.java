package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Counter;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromthreeToeightThenTotwenty() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromoneTooneThenTozero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}
