package com.pluralsight.OverloadingMethods;

public class Main {

    public static void main(String[] args) {

        makePerson();
    }

    static void makePerson() {
        // Making a person instance by passing in parameters
        Person person1 = new Person("Kevin", 24, "Red");
        person1.displayInfo();
    }

}
