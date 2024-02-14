package edu.kirkwood.demos;

public class IfElse {
    public static void main(String[] args) {
        int x = 30;
        if (x < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Ternary operator
        int y = 30;
        System.out.println(y < 20 ? "True" : "False");

        double score = 90;
        String grade = getGrade(score);
        System.out.println(grade);
        grade = getGrade2(score);
        System.out.println(grade);
        grade = getGrade3(score);
        System.out.println(grade);

    }
    // end main

    public static String getGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static String getGrade2(double score) {
        if (score < 60) {
            return "F";
        } else if (score < 70) {
            return "D";
        } else if (score < 80) {
            return "C";
        } else if (score < 90) {
            return "B";
        } else {
            return "A";
        }
    }
    public static String getGrade3(double score) {
        return score < 60 ? "F" :
                score < 70 ? "D" :
                        score < 80 ? "C" :
                                score < 90 ? "B" : "A";
    }
}

