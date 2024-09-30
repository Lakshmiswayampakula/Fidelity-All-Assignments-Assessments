package assignment3;

import java.util.Scanner;

public class BooleanResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y ");
        int y = sc.nextInt();

        boolean result = x < y;
        System.out.println("The result of whether x is less than y is " + result);
        sc.close();
    }
}
