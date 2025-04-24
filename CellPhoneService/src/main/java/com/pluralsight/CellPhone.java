package com.pluralsight;

public class CellPhone {

    //declare variables
    long serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    // Creating constructor with default values
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Creating constructor with parameters that must be passed in
    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //region Setters and Getters
    // Setters for all 5 data
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Getters for all 5 data
    public long getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }
    //endregion

    //display the info of the user
    public void displayInfo() {
        System.out.println("Phone Serial Number: " + this.serialNumber);
        System.out.println("Phone Model: " + this.model);
        System.out.println("Phone Carrier: " + this.carrier);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Phone Owner's Name: " + this.owner + "\n");
    }

    // Dial method
    public void dial(String dialPhoneNumber, String dialOwner) {
        System.out.println(owner + "'s phone is calling " + dialOwner + " at: " + dialPhoneNumber);
    }
}
