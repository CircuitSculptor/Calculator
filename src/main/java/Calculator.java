/*
 Bartlomiej Drapinski
 25/09/24
 Basic Calculator in Java
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the first number: ");
        int b = sc.nextInt();
        System.out.println("Please enter a operation: ");
        String op = sc.next();

        switch (op) {
            case "add":
                add(a, b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
