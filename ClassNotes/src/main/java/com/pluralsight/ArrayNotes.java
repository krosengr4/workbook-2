package com.pluralsight;

import java.util.Arrays;

public class ArrayNotes {

    public static void main(String[] args) {
        //calling methods
        createAndPrintArray();
        System.out.println("\n");

        forEachLoop();
        System.out.println("\n");

        emptyArray();
        System.out.println("\n");

        copyArray();
        System.out.println("\n");

        sortArray();
        System.out.println("\n");

        //! Passing in an array into a method as a parameter
        String[] cities = {"Austin", "San Fransisco", "New Orleans", "Los Angeles"};
        //call displayNumbers() method and pass in numbers array
        displayCities(cities);
        System.out.println("\n");

        //! Returning an array from a method
        //* You don't have to specify the size of the array
        int[] numbers = getNumbers();
        //use for loop to print each value in numbers array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");
    }


    //! Creating an array and printing out its values
    static void createAndPrintArray() {

        int[] integerArray = {53, 22, 75, 24, 53, 02, 64};

        //loop through array and print every value
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
    }


    //! Using a for each loop to loop through and print out values of array
    static void forEachLoop() {

        //* Syntax: for(type elementName : arrayName) { code }
        String[] names = {"Jose", "Kevin", "Brandon", "Curits", "Jamie"};

        //using for each loop to print out names in array
        for(String name : names){
            System.out.print(name + ", ");
        }
    }


    //! creating an empty array and assigning values in the loop
    static void emptyArray() {

        //creating array with no values will set all values to default
        int[] numbers = new int[5];

        //loop through array and assign each a value
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 3;
            System.out.print(" " + numbers[i]);
        }
    }


    //! Copying an array
    static void copyArray(){

        //Creating 2 arrays. 1st(original) with values, 2nd(the copy) with no values
        String[] sportsTeams = {"Dallas Stars", "Texas Rangers", "Dallas Mavericks"}; //RIP Luka :(
        String[] copySportsTeams = new String[3]; //<--- Specify the size of the array to match original array

        //Use .arrayCopy() method
        //* Syntax: System.arrayCopy(original array name, original starting subscript, array copy name, copy starting subscript, how many elements to move)
        System.arraycopy(sportsTeams, 0, copySportsTeams, 0, 3);

        //use loop to print out each element of array copy
        for (int i = 0; i < copySportsTeams.length; i++) {
            System.out.print(copySportsTeams[i] + ", ");
        }
    }


    //! Passing in Arrays into a method as parameters.
    //I call the method and pass in the parameters in the main method at the top.
    public static void displayCities(String cities[]) {

        // (Not needed) Using s to format. Puts number in front of city when printed out.
        int s = 1;

        for (int i = 0; i < cities.length; i++) {
            System.out.print(s + "." +  cities[i] + " ");
            s++;
        }
    }


    //! Returning and array from a method
    public static int[] getNumbers(){

        //Creating array called numbers and giving values
        int[] numbers = {234, 78, 345, 784};

        // Returning numbers array
        return numbers;
    }

    //! Sorting an array
    public static void sortArray() {
        String[] nameList = {"Kevin", "Michael", "Rosie", "Stephanie",
                "Roxanne", "Tiffany", "Brad", "Chad"};

        //array.sort method will sort based on natural ordering of elements
        //In this case it will sort them alphabetically
        Arrays.sort(nameList);

        for (String name: nameList){
            System.out.println(name);
        }
    }
}
