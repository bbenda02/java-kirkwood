package edu.kirkwood.demos;

public class IfElse {


    /**
     * Returns a grade based on the input score.
     *
     * @param score the score for which the grade needs to be determined
     * @return the grade as a string based on the score
     */
    public String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

}