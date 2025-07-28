
import java.util.Scanner;

/*
 * 6. Write a Java program to check whether a given number is an Armstrong or not.
      Armstrong number if the sum of the cubes of its digits is equal to the number itself (e.g.,
      153, 370, 371,407)
 */

public class ques6 {

    static boolean checkArmstrong(int num){
        int originalNum = num;
        int armNumber=0;

        while(num > 0){
            int digit = num % 10;
            armNumber = armNumber + digit * digit * digit;
            num = num / 10;
        }
        return originalNum == armNumber;
    }


    public static void main(String[] args) {
        int num;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter The Number to check if it is Armstrong or not: ");
        num = askIn.nextInt();

        
        if(checkArmstrong(num)){
            System.out.println("The Given Number is Armstrong");
        } else {
            System.out.println("The Given Number is Not an Armstrong");
        }

        askIn.close();
    }
}
