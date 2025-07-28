
import java.util.Scanner;

/*
 * 2. Write a Java program that accepts an integer from the user and checks whether the
      given number is even or odd. Use the modulus operator to determine the result.
 */

public class ques2 {

    static boolean oddEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int num;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter the Number to check odd even: ");
        num = askIn.nextInt();

        if (oddEven(num)) {
            System.out.print("The number is evem ");

        } else {
            System.out.print("The number is odd ");
        }

        askIn.close();
    }
}
