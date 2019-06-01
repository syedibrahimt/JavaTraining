package com.syed.day2;

public class SwitchCase {
    public static void main(String[] args) {
        printDay(3);
    }

    private static void switchInt() {
        int i = -1;
        switch (i) {
            case -1:
                System.out.println("This is a negative number");
                break;
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("This is the positive number");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }

    private static void switchString() {
        String month = "May";
        switch (month) {
            case "January":
                System.out.println("The month is January");
                break;
            case "February":
                System.out.println("The month is February");
                break;
            case "March":
                System.out.println("The month is March");
                break;
            case "April":
                System.out.println("The month is April");
                break;
            case "May":
                System.out.println("The month is May");
                break;
            case "June":
                System.out.println("The month is June");
                break;
            case "July":
                System.out.println("The month is january");
                break;
            case "August":
                System.out.println("The month is July");
                break;
            case "September":
                System.out.println("The month is january");
                break;
            case "October":
                System.out.println("The month is September");
                break;
            case "November":
                System.out.println("The month is November");
                break;
            case "December":
                System.out.println("The month is December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    private static void printDay(int day) {
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
