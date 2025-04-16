package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = myScanner.nextLine();

        System.out.println("Enter the full date of the show you are attending (ex: 12/12/2012): ");
        String date = myScanner.nextLine();

        System.out.println("Enter the number of tickets you will need: ");
        int numberOfTix = myScanner.nextInt();


    }

}
