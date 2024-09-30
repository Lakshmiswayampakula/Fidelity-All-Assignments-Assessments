package assignment3.FindingPersonsAge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        // Input first name
        System.out.print("Enter first name: ");
        person.setFirstName(scanner.nextLine());
        // Input last name
        System.out.print("Enter last name: ");
        person.setLastName(scanner.nextLine());
        // Input date of birth in yyyy/MM/dd format
        System.out.print("Enter date of birth in yyyy/MM/dd format: ");
        String dobInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        person.setDob(dob);

        // Display person details
        person.displayDetails();

        scanner.close();
    }
}

