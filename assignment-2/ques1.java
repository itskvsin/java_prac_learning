/*
 * Q-1 : 
        Write a Java program using the Object-Oriented Programming (OOP) concept to find the Greatest Common
        Divisor (GCD) of two positive integers using recursion.
        The program should:
            1. Define a class GCDExample that contains:
            o Two instance variables to store the numbers.
            o A constructor to initialize these numbers.
            o A public method calculateGCD() that calls a private recursive method gcdRecursive(int a, int b)
                implementing Euclid’s Algorithm.

        2. In the main() method:
            o Create an object of GCDExample by passing two positive integers.
            o Display the GCD of the two numbers.
 * 
 */

class Ques1 {
    private int number1, number2;

    public Ques1(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int calculateGCD() {
        if (number1 < 0 || number2 < 0) {
            throw new IllegalArgumentException("Inputs must be positive numbers");
        }
        return gcdRecursive(number1, number2);
    }

    private int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static void main(String[] args) {
        Ques1 q = new Ques1(78,66);

        int gcd = q.calculateGCD();

        System.out.printf("The GCD is: %d\n", gcd);
    }
}