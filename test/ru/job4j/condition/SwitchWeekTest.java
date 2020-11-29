package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {
    @Test
    public void friday() {
        String day = SwitchWeek.nameOfDay(5);
        assertThat(day, is("Пятница"));
    }

    @Test
    public void sunday() {
        String day = SwitchWeek.nameOfDay(7);
        assertThat(day, is("Воскресенье"));
    }

    @Test
    public void monday() {
        String day = SwitchWeek.nameOfDay(1);
        assertThat(day, is("Понедельник"));
    }

    @Test
    public void wednesday() {
        String day = SwitchWeek.nameOfDay(3);
        assertThat(day, is("Среда"));
    }

    @Test
    public void tuesday() {
        String day = SwitchWeek.nameOfDay(2);
        assertThat(day, is("Вторник"));
    }

    @Test
    public void thursday() {
        String day = SwitchWeek.nameOfDay(4);
        assertThat(day, is("Четверг"));
    }

    @Test
    public void saturday() {
        String day = SwitchWeek.nameOfDay(6);
        assertThat(day, is("Суббота"));
    }

    @Test
    public void falseAlarm() {
        String day = SwitchWeek.nameOfDay(8);
        assertThat(day, is("Ошибка"));
    }
}
