package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class MaxTest {

        @Test
        public void whenMax1To2Then2() {
            int result = Max.max(1, 2);
            assertThat(result, is(2));
        }

        @Test
        public void whenMax10To1Then10() {
            int result = Max.max(10, 1);
            assertThat(result, is(10));
        }

        @Test
        public void whenMax5To20Then20() {
            int result = Max.max(5, 20);
            assertThat(result, is(20));
        }

        @Test
        public void whenMax15To15Then15() {
            int result = Max.max(15, 15);
            assertThat(result, is(15));
        }
    }

