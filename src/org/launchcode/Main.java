package org.launchcode;

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
    }
}

