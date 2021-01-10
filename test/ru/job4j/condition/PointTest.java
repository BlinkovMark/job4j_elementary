package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void object3d() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(5.1961, 0.0001));
    }

    @Test
    public void object3d1() {
        Point a = new Point(20, 10, 15);
        Point b = new Point(12, 6, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(14.9666, 0.0001));
    }

    @Test
    public void object() {
        Point a = new Point(10, 50);
        Point b = new Point(50, 10);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(56.5685, 0.0001));
    }
}