package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Name Parser!");

        System.out.println("Please enter your full name: ");
        String fullName = myScanner.nextLine();

        fullName = fullName.trim();

        String[] nameParts = fullName.split(" ");

        System.out.println("First name: " + nameParts[0]);

//        System.out.println(nameParts.length);

        if(nameParts.length == 2) {
            System.out.println("Last name: " + nameParts[1]);
        } else if (nameParts.length == 3) {
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
        } else {
            System.out.println("Error: Incorrect number of names entered. Enter only first middle and last.");
        }

//        System.out.println("Middle name: " + nameParts[1]);
//        System.out.println("Last name: " + nameParts[2]);

    }

}
