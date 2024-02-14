package edu.kirkwood.shared;

import java.text.DecimalFormat;

public class Helpers {
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