package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Strings {

    public static void main(String[] args) {

        stringMethods();
        stringSplitting();
        convertingStrings();

    }

    static void stringMethods() {

        String s1 = "Hello";
        String s2 = "  world ";
        String s3 = "PLURALSIGHT-20OFF";

        //find the length of the string
        int s1Length = s1.length();
        System.out.println("Length of s1: " + s1Length);

        // Trim the space before and after the string
        String s2Trim = s2.trim();
        System.out.println("s2 trimmed: " + s2Trim);

        // Make the whole string uppercase
        String s1Upper = s1.toUpperCase();
        System.out.println("s1 upper cased: " + s1Upper);

        //Return the character at a specific position (0 based)
        char specificPosition = s1.charAt(4);
        System.out.println("s1 specific character: " + specificPosition);

        //Determine if string STARTS with particular substring
        if(s3.startsWith("PLURALSIGHT")){
            System.out.println("s3 starts with 'PLURALSIGHT'");
        }

        // Determine if a string ENDS with a particular substring
        if(s3.endsWith("20Off")){
            System.out.println("s3 ends with '20OFF'");
        }

        //You can chain String methods
        String trimAndUpper = s2.trim().toUpperCase();
        System.out.println("s2 trimmed and upper cased: " + trimAndUpper);

        System.out.println("------------------------------------------------------------------------------------");
    }

    static void stringSplitting() {
        // You can split strings at a certain character using .split("") method.
        // When you split a string, it puts the parts of the string into an array

        String date = ("05/12/2025");
        System.out.println("The date is: " + date);

        // Splitting the date string based on "/" character
        String[] dateParts = date.split("/");
        System.out.println("The month is: " + dateParts[0]);
        System.out.println("The day is: " + dateParts[1]);
        System.out.println("The year is: " + dateParts[2]);

        System.out.println("------------------------------------------------------------------------------------");
    }

    static void convertingStrings() {

        // Converting a string to and int
        String homeScore = "24";
        String awayScore = "37";
        //To compare these we need to parse them to integers
        int homeScoreInt = Integer.parseInt(homeScore);
        int awayScoreInt = Integer.parseInt(awayScore);
        // Compare and find winner
        if(homeScoreInt > awayScoreInt){
            System.out.println("home team wins");
        } else if (awayScoreInt > homeScoreInt) {
            System.out.println("away team wins");
        } else {
            System.out.println("its a tie");
        }

        //Converting a string to a date using LocalDate.parse()
        // This only works when date is formatted YYYY-MM-DD
        String date = "2025-12-12";
        LocalDate dateParsed = LocalDate.parse(date);
        System.out.println("Parsed date: " + dateParsed);





    }

}
