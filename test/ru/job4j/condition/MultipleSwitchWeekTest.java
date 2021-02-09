package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenNameOfDayWednesday() {
        int name = MultipleSwitchWeek.numberOfDay("Wednesday");
        assertThat(name, is(3));
    }

    @Test
    public void whenNameOfDayRusWednesday() {
        int name = MultipleSwitchWeek.numberOfDay("Среда");
        assertThat(name, is(3));
    }
}