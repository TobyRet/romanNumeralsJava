package com.codurance;

/**
 * Created by tobyretallick on 09/09/2014.
 */
public class RomanNumerals {

    public static String convert(int value) {
        String convertedValue = "";
        for(ConversionTable row : ConversionTable.values()) {
            while(value >= row.arabic) {
                convertedValue += row.roman;
                value -= row.arabic;
            }
        }
        return convertedValue;
    }

    private static enum ConversionTable {
        FIFTY(50, "L"),
        TEN(10, "X"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private int arabic;
        private String roman;

        ConversionTable(int arabic, String roman){
            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
