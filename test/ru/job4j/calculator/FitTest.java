package ru.job4j.calculator;

        import org.junit.Assert;
        import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman172Then71() {
        short in = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}