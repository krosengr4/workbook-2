package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = myScanner.nextLine();


        System.out.println("Please enter your middle name (press Enter to skip): ");
        String middleName = myScanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Please enter your suffix (press Enter to skip): ");
        String suffix = myScanner.nextLine();

        String fullName = firstName + " "
                + (middleName.isEmpty() ? "" : middleName + " ")
                + lastName
                + (suffix.isEmpty() ? "" : ", " + suffix);


        System.out.println("Your full name is: " + fullName);

    }

}
