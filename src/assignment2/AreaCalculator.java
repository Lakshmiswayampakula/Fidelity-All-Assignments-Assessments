package assignment2;

public class AreaCalculator {

        // Method to calculate the area of a square
        public double calculateArea(double side) {
            return side * side;
        }

        // Method to calculate the area of a rectangle
        public double calculateArea(double length, double width) {
            return length * width;
        }

        // Method to calculate the area of a circle
        public double calculateArea(double radius, boolean isCircle) {
            if (isCircle) {
                return Math.PI * radius * radius;
            }
            return 0.0;
        }

        public static void main(String[] args) {
            AreaCalculator calculator = new AreaCalculator();

            // Calculate the area of a square with side length 5.0
            double squareArea = calculator.calculateArea(5.0);
            System.out.println("Area of the square: " + squareArea);

            // Calculate the area of a rectangle with length 4.0 and width 6.0
            double rectangleArea = calculator.calculateArea(4.0, 6.0);
            System.out.println("Area of the rectangle: " + rectangleArea);

            // Calculate the area of a circle with radius 3.0
            double circleArea = calculator.calculateArea(3.0, true);
            System.out.println("Area of the circle: " + circleArea);
        }
    }

