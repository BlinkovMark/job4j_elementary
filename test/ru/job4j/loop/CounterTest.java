package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSum1() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSum2() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSum3() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToNineThenTwenty() {
        int rsl = Counter.sumByEven(0, 9);
        int expected = 20;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumberFromFToEThenT() {
        int rsl = Counter.sumByEven(5, 8);
        int expected = 14;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumberFromTTToFOThen() {
        int rsl = Counter.sumByEven(23, 51);
        int expected = 518;
        assertThat(rsl, is(expected));
    }
}