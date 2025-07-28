import java.util.Scanner;

class ques7{

    public static void main(String[] args){
        int primeNum;
        Boolean isPrime = true;

        Scanner askIn = new Scanner(System.in);


        System.out.print("Enter the number to check: ");
        primeNum = askIn.nextInt();


        if(primeNum <= 1){
            isPrime = false;
        } else {
            for(int i=2; i<= Math.sqrt(primeNum);i++){
                if(primeNum % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(!isPrime){
            System.out.print("The number is not prime");
        } else {
            System.out.print("The number is prime");
        }

        askIn.close();
    }
}