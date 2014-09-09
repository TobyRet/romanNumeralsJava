package com.codurance;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsShould {
    @Test public void
    convert_arabic_to_roman_value() {
        assertThat(RomanNumerals.convert(1), is("I"));
        assertThat(RomanNumerals.convert(2), is("II"));
        assertThat(RomanNumerals.convert(3), is("III"));
        assertThat(RomanNumerals.convert(4), is("IV"));
        assertThat(RomanNumerals.convert(5), is("V"));
        assertThat(RomanNumerals.convert(6), is("VI"));
        assertThat(RomanNumerals.convert(10), is("X"));
        assertThat(RomanNumerals.convert(20), is("XX"));
        assertThat(RomanNumerals.convert(54), is("LIV"));
    }
}