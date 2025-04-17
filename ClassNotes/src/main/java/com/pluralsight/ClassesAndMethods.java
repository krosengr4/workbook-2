package com.pluralsight;

public class ClassesAndMethods {

    //public is an access modifier
    public static void main(String[] args) {
        myPrivateMethod();
        myProtectedMethod();
    }

    //There are private methods. Private methods are only accessible to the class they are in.
    private static void myPrivateMethod() {
        System.out.println("This is a private method. This cannot be used outside of the /pluralsight.ClassesAndMethods class.");
    }

    //There are also protected methods. Can only be used within the package
    protected static void myProtectedMethod() {
        System.out.println("This is a protected method. This cannot be used outside of the /pluralsight package.");
    }
}
