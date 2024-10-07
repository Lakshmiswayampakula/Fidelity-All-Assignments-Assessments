package assignment2.MultilevelInheritance;

public class Manager extends Employee {
    String department;

    Manager(String name, int age, String employeeID, double salary, String department) {
        super(name, age, employeeID, salary);
        this.department = department;
    }

    void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}
