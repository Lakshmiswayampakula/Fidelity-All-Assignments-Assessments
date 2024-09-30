package assignment2.MultilevelInheritance;

public class Employee extends Person {
    String employeeID;
    double salary;

    Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}
