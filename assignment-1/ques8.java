/**
 * . Write a Java program to check whether a given year is a leap year or not. 
      A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 
      400. 
 */

import java.util.Scanner;

class ques8{

    static public void main(String[] args){
        int year;

        Scanner askIn = new Scanner(System.in);


        System.out.print("Enter the year: ");
        year = askIn.nextInt();

        if((year % 4 == 0 || year % 400 == 0) && ( year % 100 != 0 )){
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

        askIn.close();

    }
}