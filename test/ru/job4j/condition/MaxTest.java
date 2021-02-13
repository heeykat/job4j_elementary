package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax4To5Then5() {
        Max object = new Max();
        int result = object.max(4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax6To3Then6() {
        Max object = new Max();
        int result = object.max(6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax2To2Then2() {
        Max object = new Max();
        int result = object.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2To3Then3() {
        Max object = new Max();
        int result = object.max(2, 2,3);
        assertThat(result, is(3));
    }
}