package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax4To5Then5() {
        int result = Max.max(4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax6To3Then3() {
        int result = Max.max(6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}