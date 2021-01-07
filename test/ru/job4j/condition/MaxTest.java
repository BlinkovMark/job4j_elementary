package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class MaxTest {

        @Test
        public void whenMax4() {
            int result = Max.max(1, 2, 4, 3);
            assertThat(result, is(4));
        }

        @Test
        public void whenMax10() {
            int result = Max.max(10, 6, 1, 8);
            assertThat(result, is(10));
        }

        @Test
        public void whenMax24() {
            int result = Max.max(5, 24, 8, 13);
            assertThat(result, is(24));
        }

        @Test
        public void whenMax15() {
            int result = Max.max(12, 9, 15, 8);
            assertThat(result, is(15));
        }

        @Test
        public void whenAllEquals() {
            int result = Max.max(100, 100, 100, 100);
            assertThat(result, is(100));
        }
    }

