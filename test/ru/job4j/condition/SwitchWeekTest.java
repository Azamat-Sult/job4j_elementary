package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {

    @Test
    public void whennameOfDay1() {
        assertThat(
                SwitchWeek.nameOfDay(1),
                is("Понедельник")
        );
    }

    @Test
    public void whennameOfDay2() {
        assertThat(
                SwitchWeek.nameOfDay(2),
                is("Вторник")
        );
    }

    @Test
    public void whennameOfDay3() {
        assertThat(
                SwitchWeek.nameOfDay(3),
                is("Среда")
        );
    }

    @Test
    public void whennameOfDay4() {
        assertThat(
                SwitchWeek.nameOfDay(4),
                is("Четверг")
        );
    }

    @Test
    public void whennameOfDay5() {
        assertThat(
                SwitchWeek.nameOfDay(5),
                is("Пятница")
        );
    }

    @Test
    public void whennameOfDay6() {
        assertThat(
                SwitchWeek.nameOfDay(6),
                is("Суббота")
        );
    }

    @Test
    public void whennameOfDay7() {
        assertThat(
                SwitchWeek.nameOfDay(7),
                is("Воскресенье")
        );
    }

    @Test
    public void whennameOfDay15() {
        assertThat(
                SwitchWeek.nameOfDay(15),
                is("Ошибка")
        );
    }
}