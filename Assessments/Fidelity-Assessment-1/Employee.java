package project;

public class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    public Employee(int id, String name, float basicSalary, float bonus) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public void calculateSalary() {
        netSalary = basicSalary + bonus;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("net salary" + netSalary);

    }
}











