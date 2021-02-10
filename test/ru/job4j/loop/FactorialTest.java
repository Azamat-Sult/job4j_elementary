package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.condition.ThreeMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenFactorial5Then120() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, Matchers.is(120));
    }

    @Test
    public void whenFactorial0Then1() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, Matchers.is(1));
    }
}