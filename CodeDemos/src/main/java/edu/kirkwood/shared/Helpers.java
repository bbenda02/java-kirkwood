package edu.kirkwood.shared;

import java.text.DecimalFormat;



public class Helpers {
    /**
     * Formats a double value to a string with the specified number of decimal places.
     * @param number The double value to be formatted.
     * @param decimalPlaces The desired number of decimal places.
     * @return A string representation of the formatted number.
     * @throws IllegalArgumentException If the number of decimal places is negative.
     */
    public static String round(double number, int decimalPlaces) {
        if(decimalPlaces < 0) {
            throw new IllegalArgumentException("decimal places must be greater than 0");
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#"); // Step 1: Initiate a
        // Step 2
        decimalFormat.setMaximumFractionDigits(decimalPlaces); // Step 3
        return decimalFormat.format(number);


    }
}