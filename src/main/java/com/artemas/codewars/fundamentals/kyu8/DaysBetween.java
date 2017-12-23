package com.artemas.codewars.fundamentals.kyu8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetween {

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate dateBefore = LocalDate.of(year, month, day);
        LocalDate dateAfter = LocalDate.of(year2, month2, day2);

        Long daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

        return daysBetween.intValue();

    }
}