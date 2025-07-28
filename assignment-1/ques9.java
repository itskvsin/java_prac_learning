/**
 * 9. Write a Java program to calculate the power of a number. Accept base and exponent from 
      the user and calculate using a loop. 
      Example: ab   , e.g. 25 = 32 
 */

import java.util.Scanner;

class ques9{

    public static void main(String[] args){
        int base;
        int exponent;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter the Base: ");
        base = askIn.nextInt();
        System.out.print("Enter the Exponent: ");
        exponent = askIn.nextInt();

        int i = 1;
        while(i < exponent){
            base = base*base;
            i++;
        }

        System.out.printf("The Result is: %d",base);

        askIn.close();
    }
}