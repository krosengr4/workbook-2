package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        // Create new instance of Scanner
        Scanner myScanner = new Scanner(System.in);

        //region Use scanner to ask the user for data and store it in variables
        System.out.println("Please enter your Cellphones serial number: ");
        long userSerialNum = myScanner.nextLong();
        myScanner.nextLine();

        System.out.println("Please enter your Cellphones model: ");
        String userModel = myScanner.nextLine();

        System.out.println("Please enter your Cellphones carrier: ");
        String userCarrier = myScanner.nextLine();

        System.out.println("Please enter your Cellphones phone number: ");
        String userPhoneNum = myScanner.nextLine();

        System.out.println("Please enter the name of your cellphones owner: ");
        String ownerName = myScanner.nextLine();
        //endregion

        // Create new instance of CellPhone for user phone
        CellPhone userPhone = new CellPhone();

        // Set the data for new instance of CellPhone with data the user provided
        userPhone.setSerialNumber(userSerialNum);
        userPhone.setModel(userModel);
        userPhone.setCarrier(userCarrier);
        userPhone.setPhoneNumber(userPhoneNum);
        userPhone.setOwner(ownerName);

        // Call the displayInfo method with user's data (displayInfo() is in CellPhone.java)
        userPhone.displayInfo();

        // Create new instance of cellphone for my phone
        CellPhone myPhone = new CellPhone(874219684,"Iphone 16", "Verizon", "512-663-5880", "Kevin Rosengren");

        // Display myPhone with data I passed using parameters
        myPhone.displayInfo();

        // Call the dial method with number and owner that user wants to call
        myPhone.dial(userPhone.getPhoneNumber(), userPhone.getOwner());
        userPhone.dial(myPhone.getPhoneNumber(), myPhone.getOwner());
    }
}
