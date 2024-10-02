/*
 Bartlomiej Drapinski
 25/09/24
 Basic Calculator in Java
*/

import java.util.Scanner;   // initializing the scanner

public class Calculator {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);         // starting the scanner

        for (int i = 0; i < 20; i++) {      // repeat the main code to test all 4 operations
            System.out.print("Please enter a number: ");    // prompts the user to enter first number
            double firstNum = scan1.nextDouble();
            System.out.println("You entered " + firstNum);

            System.out.print("Please enter a number: ");    // prompts the user to enter second number
            double secondNum = scan1.nextDouble();
            System.out.println("You entered " + secondNum);

            System.out.print("Choose an operation (add, subtract, multiply, divide: ");
            // prompts the user to select an operation
            String operation = scan1.next();

            double result = switch (operation) {    // initializing the switch structure
                case "add" -> firstNum + secondNum;         // addition operation
                case "subtract" -> firstNum - secondNum;    // subtraction operation
                case "multiply" -> firstNum * secondNum;    // multiplication operation
                case "divide" -> {                          // division operation
                    if (secondNum == 0) {   // checking for 0, cannot divide my zero
                        System.out.println("Division by zero is not allowed.");
                        yield 0;
                    } else {
                        // if the number is something other than zero the operation is carried out
                        yield firstNum / secondNum;
                    }
                }
                default -> {
                    System.out.println("Invalid operation.");
                    yield 0; // yield (return) in default case
                }
            };
            System.out.println("Result: " + result);    // prints the result from the switch case
        }
    }
}
