package com.pluralsight;

import java.util.Scanner;


public class FullNameParserApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Put your full name");
        String fullName = sc.nextLine();

        //String[] tempFull = fullName.trim().split("\\s+");
        String[] tempFull = fullName.split(" ");

        int lengthFullName = tempFull.length;

        if (lengthFullName > 2) {
            System.out.println("First name: " + tempFull[0].substring(0, 1).toUpperCase() + tempFull[0].substring(1).toLowerCase() );
            System.out.println("Middle name: " + tempFull[1].substring(0, 1).toUpperCase() + tempFull[1].substring(1).toLowerCase() );
            System.out.println("Last name: " + tempFull[2].substring(0, 1).toUpperCase() + tempFull[2].substring(1).toLowerCase() );
        }
        else if (lengthFullName > 0) {
            System.out.println("First name: " + tempFull[0].substring(0, 1).toUpperCase() + tempFull[0].substring(1).toLowerCase() );
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + tempFull[1].substring(0, 1).toUpperCase() + tempFull[1].substring(1).toLowerCase() );
        }
        else {
            System.out.println("Invalid input");
        }


    }
}