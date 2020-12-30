package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K7Then1and75() {
        double expected = 1.75;
        int p = 8;
        int k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Then4() {
        double expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}