

/**
 * File Name: Applications.java
 * Assignment and Exercise Number: Lab01 Exercise C
 * Names: Monil Patel
 * Submission Date: July 02, 2024
 * 
 */
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter operation (add, subtract, multiply, divide) or 'exit' to quit:");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break;
            }

            // For operations requiring two inputs
        
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (operation.toLowerCase()) {
                    case "add":
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case "subtract":
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case "multiply":
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case "divide":
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        break;
                }
             
            
        }

        scanner.close();
    }
}

// 4.4.4

//Addition
public static double add(double a, double b) {
    return a + b;
}

//Subtraction 
public static double subtract(double a, double b) {
	return a-b;
}


//multiply
public static double multiply(double a, double b) {
	return a*b;
}

//divide 
public static double divide(double a, double b) {
	return a/b;
}








