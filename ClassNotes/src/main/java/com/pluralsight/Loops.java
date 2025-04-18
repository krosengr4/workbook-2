package com.pluralsight;

public class Loops {
    // There are while loops, do / while loops, and for loops.
    // You can exit any of these loops early using a break statement
    public static void main(String[] args) {

        whileLoop();
        doWhileLoop();
        forLoop();

    }

    //While loops. Execute a block of code repeatedly as long as condition is true.
    //used to loop through a stream of data when the length of the stream is unknown
    static void whileLoop() {
        //basic while loop
        int i = 1;
        int sum = 0;

        while (i <= 10){
            sum += 1;
            i++;
            System.out.print("While Sum = " + sum + " ");
        }
        System.out.println("\n");

    }

    // do / while loops.
    // Similar to while loops except that the condition is evaluated at the bottom, so it'll eval. the code at least once.
    static void doWhileLoop() {
        //basic do/while loop
        int i = 1;
        int sum = 0;

        do {
            sum += 1;
            i++;
        System.out.print("Do/While Sum = " + sum + " ");
        } while(i <= 10);

        System.out.println("\n");
    }

    //for loops. for(initialization; condition; other;)
    // Used to execute a loop a fixed number of times.
    static void forLoop() {
        //increment for loop
        for(int i = 0; i < 10; i++) {
            System.out.print("For i = " + i + " ");
        }

        System.out.println("\n");

        //using break statement
        for (int i = 0; i < 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.print("break i = " + i + " ");
        }

        System.out.println("\n");

        //using continue
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            System.out.print("cont i = " + i + " ");
        }

        System.out.println("\n");
    }

}
