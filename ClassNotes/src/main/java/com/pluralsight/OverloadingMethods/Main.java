package com.pluralsight.OverloadingMethods;

public class Main {

    public static void main(String[] args) {

        makePerson();
    }

    static void makePerson() {
        Person person1 = new Person("Kevin", 24, "Red");
        person1.displayInfo();
    }

}
