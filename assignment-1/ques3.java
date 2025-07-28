/*
 * 3. Write a Java program to calculate the factorial of a given number. Accept the number
      from the user and use a loop (for or while) to perform the calculation.
 */

import java.util.Scanner;

public class ques3 {
    
    public static void main(String[] args) {
        int num;
        int factorial=1;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter the Number for the factorial: ");
        num = askIn.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial = i*factorial;
            System.out.printf("\n%d",factorial);
        }


        askIn.close();
    }
}
