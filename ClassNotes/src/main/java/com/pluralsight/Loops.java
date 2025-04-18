package com.pluralsight;

public class Loops {
    // There are while loops, do/while loops, and for loops.
    // You can exit any of these loops early using a break statement
    public static void main(String[] args) {
        // Calling methods
        whileLoop();
        System.out.println("\n"); //<--- formatting
        doWhileLoop();
        System.out.println("\n"); //<--- formatting
        forLoop();
        System.out.println("\n"); //<--- formatting

    }

    //! While loops. Execute a block of code repeatedly as long as condition is true.
    //? used to loop through a stream of data when the length of the stream is unknown
    static void whileLoop() {
        //basic while loop
        int i = 1;
        int sum = 0;

        while (i <= 10){
            sum += 1;
            i++;
            System.out.print("WhileLoop Sum = " + sum + " "); //<--- print sum inside the loop to print every value sum goes through
        }

    }

    // do / while loops.
    // Similar to while loops except that the condition is at the bottom, so it'll go through the do loop at least once.
    static void doWhileLoop() {
        //basic do/while loop
        int i = 1;
        int sum = 0;

        do {
            sum += 1;
            i++;
        } while(i <= 10);

        System.out.print("Do/While Sum = " + sum + " "); //<--- Print the sum outside of loop to print the value sum ends on
    }

    //for loops.
    //* Syntax: for(initialization; condition; other;)
    //! Used to execute a loop a fixed number of times.
    static void forLoop() {
        //increment for loop
        for(int i = 0; i < 5; i++) {
            System.out.print("For i increment = " + i + " ");
        }

        System.out.println("\n"); //<--- formatting

        //decrement for loop
        for (int i = 5; i >= 0 ; i--) {
            System.out.print("For i decrement = " + i + " ");
        }

        System.out.println("\n"); //<--- formatting

        //using break statement
        for (int i = 0; i < 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.print("break i = " + i + " ");
        }

        //using continue
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            System.out.print("continue i = " + i + " ");
        }
    }
}
