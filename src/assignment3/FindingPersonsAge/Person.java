package assignment3.FindingPersonsAge;

import java.time.LocalDate;
import java.time.Period;
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getAdult() {
        if (getAge(dob) >= 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }
    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(dob));
        System.out.println(getAdult());
    }
    public int getAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }
}

