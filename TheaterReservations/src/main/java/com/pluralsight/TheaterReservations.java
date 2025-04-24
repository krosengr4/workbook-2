package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        //Open scanner
        Scanner myScanner = new Scanner(System.in);

        //Get users name
        System.out.println("Enter your first name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = myScanner.nextLine();

        //Get the attendance date of the user
        System.out.println("Enter the full date of the show you are attending (ex: 12/12/2012): ");
        String date = myScanner.nextLine();

        //Get the number of tickets the user will need
        System.out.println("Enter the number of tickets you will need: ");
        int numberOfTix = myScanner.nextInt();

        //format user input
        String tixFormatted;
        if (numberOfTix == 1){
            tixFormatted = numberOfTix + " ticket";
        } else {
            tixFormatted = numberOfTix + " tickets";
        }

        //Print out message with user input
        System.out.println(tixFormatted + " reserved for " + date + " under " + lastName + ", " + firstName);
    }
}
