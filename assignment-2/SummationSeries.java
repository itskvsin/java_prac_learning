/*
   Q-2 :
        Write a Java program using the Object-Oriented Programming (OOP) approach to compute the sum of the
        following series:
        S=1/1+1/2+1/3+⋯+1/n
        S1 = 1/1 + 1/2 +1/22 + ..... 1/2n
        where n is a positive integer entered by the user.
            1. Create a class Rational to represent a rational number (fraction) with:
                o Two instance variables: numerator and denominator.
                o A constructor to initialize the rational number and simplify it.
                o A method add(Rational other) to add two rational numbers and return the result as a new Rational
                    object.
                o A toString() method to return the rational number in numerator/denominator format.
            2. In the main class Summation Series:
                o Prompt the user to enter the value of n.
                o Compute the sum of the series using Rational objects without converting fractions to decimals.
                o Display the sum as a simplified fraction.
 */

import java.util.Scanner;

public class SummationSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n must be a positive integer.");
            scanner.close();
            return;
        }

        // --- Calculate Series S: 1/1 + 1/2 + 1/3 + ... + 1/n ---
        System.out.println("\nCalculating Series S:");
        Rational sumS = new Rational(0, 1); // Start with 0/1

        for (int i = 1; i <= n; i++) {
            Rational term = new Rational(1, i);
            sumS = sumS.add(term);
        }

        System.out.println("Sum of series S = " + sumS);

        System.out.println("----------------------------------------");

        // --- Calculate Series S1: 1/1 + 1/2 + 1/2^2 + ... + 1/2^n ---
        System.out.println("\nCalculating Series S1:");
        Rational sumS1 = new Rational(0, 1); // Start with 0/1

        for (int i = 0; i <= n; i++) {
            int denominator = (int) Math.pow(2, i);
            Rational term = new Rational(1, denominator);
            sumS1 = sumS1.add(term);
        }

        System.out.println("Sum of series S1 = " + sumS1);
        
        scanner.close();
    }
}


class Rational {
    private int numerator;
    private int denominator;

    // Constructor to initialize and simplify the rational number
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int commonDivisor = gcd(numerator, denominator);
        this.numerator = numerator / commonDivisor;
        this.denominator = denominator / commonDivisor;
        
        // Ensure the denominator is positive
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Private helper method to find the greatest common divisor for simplification
    private int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }

    // Method to add two rational numbers
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Method to return the rational number in numerator/denominator format
    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }
}