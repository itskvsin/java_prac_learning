import java.util.Scanner;

class question1 {

    static void swap(int a, int b, int temp) {
        temp = a;
        a = b;
        b = temp;

        System.out.printf("The Swapped Number Using Variable: A:%d B:%d", a, b);
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("The Swapped Number wihout Variable: A:%d B:%d", a, b);
    }

    public static void main(String[] args) {
        
        int a,b,temp=0;
        String choice;

        Scanner askIn = new Scanner(System.in);

        System.out.print("Enter number1: ");
        a = askIn.nextInt();
        System.out.print("Enter number2: ");
        b = askIn.nextInt();

        askIn.nextLine();

        System.out.print("Do you want to do it without variable or not yes/no: ");
        choice = askIn.nextLine();

        if (choice.equals("yes")) {
            swap(a, b);
        } else {
            swap(a, b, temp);
        }


        askIn.close();
    }
}