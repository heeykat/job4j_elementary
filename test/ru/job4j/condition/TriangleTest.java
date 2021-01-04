package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist2to2to2() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExist2to4to7() {
        boolean result = Triangle.exist(2.0, 4.0, 7.0);
        assertThat(result, is(false));
    }
}