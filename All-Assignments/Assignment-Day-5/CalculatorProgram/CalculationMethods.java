package assignment3.CalculatorProgram;

public class CalculationMethods {
    // Addition method
    public int Addition(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int Subtraction(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public int Multiplication(int a, int b) {
        return a * b;
    }

    // Division method (returns quotient and remainder)
    public double Division(int a, int b, double[] remainder) {
        remainder[0] = a % b;
        return (double) a / b;
    }
}
