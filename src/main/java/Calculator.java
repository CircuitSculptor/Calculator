/*
 Bartlomiej Drapinski
 02/10/24
 Calculator in Java using Github
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //methods
        System.out.print("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("Please enter the first number: ");
        double b = sc.nextDouble();
        System.out.println("Please enter an operation: ");
        System.out.println("add, subtract, multiply, divide, exponent");
        String op = sc.next();

        switch (op) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                sub(a, b);
                break;
            case "multiply":
                mul(a, b);
                break;
            case "divide":
                div(a, b);
                break;
            case "exponent":
                exp(a, b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    public static void add(double a, double b) {
        double sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    public static void sub(double a, double b) {
        double sub = a - b;
        System.out.println("The answer is: " + sub);
    }
    public static void mul(double a, double b) {
        double mul = a * b;
        System.out.println("The answer is: " + mul);
    }
    public static void div(double a, double b) {
        if (b == 0) {   // checking for 0, cannot divide my zero
            System.out.println("Division by zero is not allowed.");
        } else {
            // if the number is something other than zero the operation is carried out
            double div = a / b;
            System.out.println("The answer is: " + div);
        }
    }
    public static void exp(double a, double b) {
        double exp = Math.pow(a, b);
        System.out.println("The answer is: " + exp);
    }
}
