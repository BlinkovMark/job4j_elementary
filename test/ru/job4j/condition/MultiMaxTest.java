package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(2, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 5, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 4, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenFMax() {
        int result = MultiMax.max(10, 7, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenSMax() {
        int result = MultiMax.max(2, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenTMax() {
        int result = MultiMax.max(10, 5, 100);
        assertThat(result, is(100));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(210, 210, 210);
        assertThat(result, is(20));
    }

    @Test
    public void whenSomethingWrong() {
        int result = MultiMax.max(1, 2, 3);
        assertThat(result, is(2));
    }
}