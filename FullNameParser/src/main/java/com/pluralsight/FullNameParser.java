package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // Create new instance of scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Name Parser!");

        // Ask user for data and store it in variable
        System.out.println("Please enter your full name: ");
        String fullName = myScanner.nextLine();

        // trim the user input
        fullName = fullName.trim();

        // split user data string at the " "
        String[] nameParts = fullName.split(" ");

        // Print out first name
        System.out.println("First name: " + nameParts[0]);

        // Determine if user put in 2 or 3 names and print last name and middle name (if user included)
        if(nameParts.length == 2) {
            System.out.println("Last name: " + nameParts[1]);
        } else if (nameParts.length == 3) {
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
        } else {
            System.out.println("Error: Incorrect number of names entered. Enter only first middle and last.");
        }

    }

}
