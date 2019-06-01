package com.syed.day2;

public class Methods {
    public static void main(String[] args) {
        System.out.println("=======START_OF_PROGRAM==========");
        displayHighScorePosition("syed", calculateHighScorePosition(1500));
        displayHighScorePosition("ibrahim", calculateHighScorePosition(900));
        displayHighScorePosition("siddarth", calculateHighScorePosition(400));
        displayHighScorePosition("pandi", calculateHighScorePosition(50));
        System.out.println("=======END_OF_PROGRAM==========");
    }

    public static void calculateAverage(int marks, int totalSub) {
        System.out.println("The average is " + (float) marks / totalSub);
    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the highscore table");
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }
}
