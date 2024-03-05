package edu.kirkwood.codingbat;


public class String1 {
    // In-Class: 9 Challenges from String 1 Section
    /**
     * CodingBat: In-Class Challege.
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String makeOutWord(String out, String word) {
        String front = out.substring(0,2);
        String back = out.substring(2);
        return front+word+back;
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length()-2);
        return lastTwo+lastTwo+lastTwo;
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0,2);
        } else {
            return str;
        }
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() /2);
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    /**
     * CodingBat: In-Class Challege.
     */
    public String comboString(String a, String b) {
        if (a.length()>b.length()) {
            return b+a+b;
        } else {
            return a+b+a;
        }
    }


// Homework: 7 Challenges from String 1

    /**
     * Given 2 strings, returns their concatenation, excluding the first character of each.
     * The strings will be at least length 1.
     *
     * @param a The first input string.
     * @param b The second input string.
     * @return The concatenation of the input strings with the first character of each omitted.
     */
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

    /**
     * Given a string, returns a "rotated left 2" version where the first 2 characters are moved to the end.
     * The string length will be at least 2.
     *
     * @param str The input string.
     * @return The string with the first 2 characters moved to the end.
     */
    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }

    /**
     * Given a string, returns a "rotated right 2" version where the last 2 characters are moved to the start.
     * The string length will be at least 2.
     *
     * @param str The input string.
     * @return The string with the last 2 characters moved to the start.
     */
    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }

    /**
     * Given a string of odd length, returns the substring of length 3 from its middle.
     *
     * @param str The input string.
     * @return The substring of length 3 from the middle of the input string.
     */
    public String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle-1,middle+2 );
    }

    /**
     * Given a string of any length, returns a new string where the last 2 characters, if present, are swapped.
     *
     * @param str The input string.
     * @return The input string with the last two characters swapped, or the original string if its length is less than 2.
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String base = str.substring(0, str.length()-2);
        char secondLastChar = str.charAt(str.length()-2);
        char charLast = str.charAt(str.length()-1);
        return base + charLast + secondLastChar;
    }

    /**
     * Given a string, returns "red" if the string begins with "red", "blue" if the string begins with "blue",
     * otherwise returns an empty string.
     *
     * @param str The input string.
     * @return Either "red", "blue", or an empty string based on the beginning of the input string.
     */
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    /**
     * Given a string, returns a string of length 1 from its front if 'front' is true,
     * otherwise returns a string of length 1 from its back. The string will be non-empty.
     *
     * @param str   The input string.
     * @param front Indicates whether to return the character from the front (true) or the back (false).
     * @return A string of length 1 from the specified end of the input string.
     */
    public String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0));
        } else {
            return String.valueOf(str.charAt(str.length() -1));
        }
    }
}
