package com.pluralsight;

public class CellPhone {

    long serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Setters for all 5 data
    public void setSerialNumber(long serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    // Getters for all 5 data
    public long getSerialNumber(){
        return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }

}
