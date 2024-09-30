package assignment3;

import java.util.Scanner;

public class FindSquareAndCube {
    public static double FindSquare(double num){
        return num*num;
    }
    public static double FindCube(double num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextDouble();

        double square = FindSquare(num);
        double cube = FindCube(num);
        System.out.println("The square is "+square);
        System.out.println("The cube is "+cube);
        sc.close();
    }
}
