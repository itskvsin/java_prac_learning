
import java.util.Scanner;

/*
 * 5. Write a Java program to check whether a given number is a palindrome or not. A
      palindrome is a number that reads the same backward as forward (e.g., 121, 1331).
 */

public class ques5 {

    static boolean checkPalindrome(int num){
        int originalNum = num;
        int reverseNum=0;

        while(num > 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        return originalNum == reverseNum;
    }

    public static void main(String[] args) {
        int num ;

        Scanner askIn = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        num = askIn.nextInt();

        askIn.close();

        if (checkPalindrome(num)) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is Not a Palindrome");
        }
        

    }
}
