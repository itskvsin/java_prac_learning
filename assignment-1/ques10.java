/**
    10. Write a Java program to check whether a number is a perfect number or not. 
      A perfect number is a number whose sum of proper divisors equals the number itself. 
      Example: 6 → 1+2+3=6 
 */

import java.util.Scanner;

class ques10{

    public static void main(String[] args){
        
        int num;
        int sum = 0;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter a Number to check if it is perfect or not: ");
        num = askIn.nextInt();
        

        for(int i=1; i< num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
        System.out.print("The number is a Perfect Number");
        } else {
        System.out.print("The number is not a Perfect Number");
        }



        // askIn.close();
    }
}