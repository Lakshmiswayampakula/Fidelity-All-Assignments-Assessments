package assignment3.CalculatorProgram;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculationMethods calculator = new CalculationMethods();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the first operand:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second operand:");
        int num2 = scanner.nextInt();

        double[] remainder = new double[1];
        double result = 0;

        switch (operator) {
            case '+':
                result = calculator.Addition(num1, num2);
                System.out.println("Result of " + num1 + " + " + num2 + " is " + (int)result);
                break;
            case '-':
                result = calculator.Subtraction(num1, num2);
                System.out.println("Result of " + num1 + " - " + num2 + " is " + (int)result);
                break;
            case '*':
                result = calculator.Multiplication(num1, num2);
                System.out.println("Result of " + num1 + " * " + num2 + " is " + (int)result);
                break;
            case '/':
                if (num2 != 0) {
                    result = calculator.Division(num1, num2, remainder);
                    System.out.println("Result of " + num1 + " / " + num2 + " is " + (int)result);
                    System.out.println("Remainder = " + (int)remainder[0]);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
