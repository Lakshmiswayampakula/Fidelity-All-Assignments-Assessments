package assignment3;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        //creating a scanner object to take input
        Scanner sc = new Scanner(System.in);

        //get user input
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Country: ");
        String country = sc.nextLine();

        //Display registration details
        System.out.println("Welcome " + firstName + " " + lastName + ", your age is " + age + " and you are from " + country +".");
        sc.close();
    }
}
