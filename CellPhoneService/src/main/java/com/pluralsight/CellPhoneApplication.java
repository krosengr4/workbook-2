package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

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

        CellPhone userCellphone = new CellPhone();

        userCellphone.setSerialNumber(userSerialNum);
        userCellphone.setModel(userModel);
        userCellphone.setCarrier(userCarrier);
        userCellphone.setPhoneNumber(userPhoneNum);
        userCellphone.setOwner(ownerName);

        System.out.println("Your phone's serial number is: " + userCellphone.getSerialNumber());
        System.out.println("Your phone's model is: " + userCellphone.getModel());
        System.out.println("Your phone's carrier is: " + userCellphone.getCarrier());
        System.out.println("Your phone's phone number is: " + userCellphone.getPhoneNumber());
        System.out.println("The name of your phone's owner is: " + userCellphone.getOwner());
    }

    static void myCellphone() {
        CellPhone myCellPhone = new CellPhone();
        myCellPhone.setSerialNumber(41234125);
        myCellPhone.setModel("iPhone");

        System.out.println(myCellPhone.getModel() + myCellPhone.getSerialNumber());
    }

}
