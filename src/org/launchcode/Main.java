package org.launchcode;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {

//Create a while loop to find the numbers between 15-25

        int x = 15;
        while(x < 25) {
            System.out.println("value of run :" + x);
            x++;
        }

        //for loops

        for(int i = 155; i < 255; i++) {
            System.out.println("List of numbers are x:" + i);

        }
        // if statement example

        int a = 101;
        if (a < 150) {
            System.out.println("My number will print out.");
        }

        String name = "Mary";

        if ( name == "Mary") {
            System.out.println("This is not the person");
        }


        // if-else statement example

        if (a < 50) {
            System.out.println("My number is not 101");
        }else {
            System.out.println("My number is 101");
        }

        //we can also create multiple if-elseif-else statement

        if (a == 20) {
            System.out.println("The number is 20");
        }else if (a == 101) {
            System.out.println("You are an awesome programmer");
        }else {
            System.out.println("This is just an example.");
        }

        // Switch statement
        int highestNumber = 95;

        switch(highestNumber) {
            case 100 :
                System.out.println("Excellent!");
                break;
            case 85 :
            case 80 :
                System.out.println("Well done");
                break;
            case 70 :
                System.out.println("You passed");
            case 50 :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + highestNumber);

        //Strings

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );


        //Arrays and numbers

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }

    }


