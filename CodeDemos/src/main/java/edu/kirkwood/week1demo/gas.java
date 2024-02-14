package edu.kirkwood.week1demo;

public class gas {

    public static void main(String[] args) {
        double currentRewardPerGallon = 0.05;
        double gallonsOfGasPurchased = 341.6;
        double fuelSavingsThisMonth = gallonsOfGasPurchased * currentRewardPerGallon;
        System.out.printf("Your fuel savings this month $%.2f%n", + fuelSavingsThisMonth);
        }
    }