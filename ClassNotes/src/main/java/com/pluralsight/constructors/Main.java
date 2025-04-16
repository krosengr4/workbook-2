package com.pluralsight.constructors;

public class Main {

    public static void main(String[] args) {

        // Making new person from Person constructor
        Person myPerson = new Person("Kevin"); //<--- name is a parameter when making a new Person
        myPerson.favColor = "Red";
        myPerson.age = 24;

        System.out.println("My name is: " + myPerson.name); //<--- "Kevin" is the name argument we passed into Person
        System.out.println("My favorite color is : " + myPerson.favColor);
        System.out.println("My age is: " + myPerson.age);
        System.out.println("I have " + myPerson.numbOfLegs + " legs"); //<--- This is a static variable. It is the same for every Person you create.

        person2();
    }

    static void person2() {
        Person person2 = new Person("Steve");
        person2.setAge(100); //<--- Using the setter in Person.java
        person2.favColor = "Orange";

        System.out.println("Person 2 Name: " + person2.name + "\n" + "Person 2 favorite color: " + person2.favColor + "\n" + "Person 2 age: " + person2.age);
    }
}
