package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {6, 4, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 6, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {10, 5, 7, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 5, 7, 10};
        assertThat(result, is(expect));
    }
}