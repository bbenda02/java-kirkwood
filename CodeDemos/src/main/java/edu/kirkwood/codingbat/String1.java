package edu.kirkwood.codingbat;


public class String1 {
    // In-Class: 9 Challenges from String 1 Section
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    public String makeOutWord(String out, String word) {
        String front = out.substring(0,2);
        String back = out.substring(2);
        return front+word+back;
    }
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length()-2);
        return lastTwo+lastTwo+lastTwo;
    }
    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0,2);
        } else {
            return str;
        }
    }
    public String firstHalf(String str) {
        return str.substring(0, str.length() /2);
    }
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    public String comboString(String a, String b) {
        if (a.length()>b.length()) {
            return b+a+b;
        } else {
            return a+b+a;
        }
    }

}