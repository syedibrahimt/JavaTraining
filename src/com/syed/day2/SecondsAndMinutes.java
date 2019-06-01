package com.syed.day2;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(20000));
    }

    private static String getDurationString(int minutes, int seconds) {
        int hours, min;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            hours = minutes/60;
            min=minutes%60;
            return hours + "h " + min + "m " + seconds + "s";
        }
        return "Invalid value";
    }

    private static String getDurationString(int seconds) {
        int min;
        if (seconds >= 0) {
            min = seconds/60;
            return getDurationString(min, seconds%60);
        }
        return "Invalid value";
    }
}
