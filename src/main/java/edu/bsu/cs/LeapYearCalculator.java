package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculator {
    @Test
    public void is2024LeapYear() {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2024);
        Assertions.assertTrue(result);
    }
    @Test
    public void is2025LeapYear() {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2025);
        Assertions.assertTrue(result);
    }
    @Test
    public void is2016LeapYear() {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
    @Test
    public void is862LeapYear() {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(862);
        Assertions.assertFalse(result);
    }
    @Test
    public void is1900LeapYear() {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(1900);
        Assertions.assertFalse(result);
    }



}
