package com.pluralsight;

public class Arrays {
    //! Once you set the size of the array, the size cannot change.

    public static void main(String[] args) {

        createAndPrintArray();
        forEachLoop();
        emptyArray();

        //Passing in an array into a method as a parameter
        String[] cities = {"Austin", "San Fransisco", "New Orleans", "Los Angeles"};
        //call displayNumbers() method and pass in numbers array
        displayCities(cities);


    }

    static void createAndPrintArray() {

        int[] integerArray = {53, 22, 75, 24, 53, 02, 64};

        //loop through array and print every value
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
        System.out.println("\n");
    }

    static void forEachLoop() {
        //Use for each loops to loop through an array
        // for(type elementName : arrayName) { code }

        String[] names = {"Jose", "Kevin", "Brandon", "Curits", "Jamie"};
        for(String name : names){
            System.out.print(name + ", ");
        }
        System.out.println("\n");
    }
    
    static void emptyArray() {
        //? create an empty array and assign values in the loop
        
        //creating array with no values will set all values to default
        int[] numbers = new int[5];

        //loop through array and assign each a value
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 3;
            System.out.print(" " + numbers[i]);
        }
        System.out.println("\n");
    }

    // Passing in Arrays into a method as parameters
    public static void displayCities(String cities[]) {
        // Using s to format out. Puts number in front of the city when printed out.
        int s = 1;

        for (int i = 0; i < cities.length; i++) {
            System.out.print(s + "." +  cities[i] + " ");
            s++;
        }
        System.out.println("\n");
    }

}
