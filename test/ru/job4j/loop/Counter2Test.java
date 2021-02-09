package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Counter2Test {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter2.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromThreeTotwelveThenForty() {
        int rsl = Counter2.sumByEven(3, 12);
        int expected = 40;
        assertThat(rsl, is(expected));
    }
}