
import java.util.Scanner;

/*
 * 4. Write a Java program to print the Fibonacci series up to n terms. Accept the value of n
      from the user and display the series in proper format.
      Output: 0 1 1 2 3 5 8 13 21 ,
 */

public class ques4 {
    public static void main(String[] args) {
        int num,prev,current=1,temp=0;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter the Number Till you want fibbonacci: ");
        num = askIn.nextInt();

        System.out.print("Output: ");

        for (int i = 0; i < num; i++) {
            prev = current;
            current = temp;
            temp = prev + current;

            System.out.printf("%d\t",current);
        }

        askIn.close();
    }
}
