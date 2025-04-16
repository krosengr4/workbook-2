package com.pluralsight.constructors;

public class Person {

    // These are instance variables. If you make them static then everyone persons name and age will be the same
    String name;
    String favColor;
    int age;

    // Assuming everyone has 2 legs, this variable would be static
    static int numbOfLegs = 2;

    //creating a constructor.
    // Name of constructor method is always the name of the class and doesn't need to declare a return type
    // This gets called in main class
    public Person (String name) {
        this.name = name; //<--- We declared String name; at the top so we need this.name to clarify
    }

    // You can also use a setter to set a variable
    public void setAge (int age) {
        this.age = age;
    }





}
