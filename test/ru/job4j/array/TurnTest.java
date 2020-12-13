package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{3, 5, 8, 9, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[]{2, 9, 8, 5, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray2() {
        int[] input = new int[]{1, 2, 3};
        int[] result = Turn.back(input);
        int[] expect = new int[]{3, 2, 1};
        assertThat(result, is(expect));
    }
}