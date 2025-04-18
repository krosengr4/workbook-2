package com.pluralsight;

public class Arrays {
    //! Once you set the size of the array, it cannot change.

    public static void main(String[] args) {

        createAndPrintArray();
        forEachLoop();
        emptyArray();

    }

    static void createAndPrintArray() {

        int[] integerArray = {53, 22, 75, 24, 53, 02, 64};

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
        
        
    }

}
