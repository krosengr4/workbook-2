package com.pluralsight.OverloadingMethods;

public class Person {

    // These are instance variables. If you make them static then everyone persons name and age will be the same
    String name;
    String favColor;
    int age;

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    //Overload the method by including parameters that must be passed in when creating a new Person
    public Person (String name, int age, String favColor) {
        this.name = name;
        this.age = age;
        this.favColor = favColor;
    }

    // Creating method to display a person's info. 
    public void displayInfo() {
        System.out.println("Persons name: " + this.name);
        System.out.println("Persons age: " + this.age);
        System.out.println("Persons favorite color: " + this.favColor);
    }
}
