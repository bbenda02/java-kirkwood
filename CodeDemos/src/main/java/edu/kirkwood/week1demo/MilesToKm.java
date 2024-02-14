package edu.kirkwood.week1demo;

public class MilesToKm {

    private static final double MILES_TO_KM = 1.609;

    public static void main(String[] args) {
        double miles;
        double km;
        // start at one, add one mile till we reach 50 values
        for(miles = 1; miles <= 50; miles += 1) {
            km = miles * MILES_TO_KM;
            String milesStr = "miles";
            if(miles == 1) {
                milesStr = "mile";
            }
            System.out.printf("%.1f %s is %.3f km\n", miles, milesStr, km);
        }
    }
}
