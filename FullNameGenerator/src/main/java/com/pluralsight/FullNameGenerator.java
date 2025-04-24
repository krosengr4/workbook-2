package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    public static void main(String[] args) {

        //Open scanner
        Scanner myScanner = new Scanner(System.in);

        //Get user first name
        System.out.println("Please enter your first name: ");
        String firstName = myScanner.nextLine();

        //Get user middle name
        System.out.println("Please enter your middle name (press Enter to skip): ");
        String middleName = myScanner.nextLine();

        //Get user last name
        System.out.println("Please enter your last name: ");
        String lastName = myScanner.nextLine();

        //Get user suffix
        System.out.println("Please enter your suffix (press Enter to skip): ");
        String suffix = myScanner.nextLine();

        //Create string that adds user inputs
        String fullName = firstName + " "
                + (middleName.isEmpty() ? "" : middleName + " ")
                + lastName
                + (suffix.isEmpty() ? "" : ", " + suffix);


        //Print out users full name
        System.out.println("Your full name is: " + fullName);
    }
}
