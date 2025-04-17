package com.pluralsight;

import java.util.Scanner;

public class CellPhoneUtils {

    static Scanner myScanner = new Scanner(System.in);

    static String userMessageAndInput(String message) {
        System.out.print(message);
        return myScanner.nextLine();
    }

}
