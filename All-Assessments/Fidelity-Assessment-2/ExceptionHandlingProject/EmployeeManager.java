package ExceptionHandlingProject;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {
    private HashMap<String, Employee> employees = new HashMap();

    public EmployeeManager() {
        this.employees.put("E101", new Employee("E101", "john Doe"));
        this.employees.put("E102", new Employee("E102", "john Smith"));
        this.employees.put("E103", new Employee("E103", "john Smith"));
    }

    public Employee findEmployee(String id) throws EmployeeNotFoundException {
        if (this.employees.containsKey(id)) {
            return (Employee)this.employees.get(id);
        } else {
            throw new EmployeeNotFoundException("Employee not found");
        }
    }

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String id = scanner.nextLine();

        try {
            Employee emp = employeeManager.findEmployee(id);
            System.out.println("Employee found: " + emp.getName());
        } catch (EmployeeNotFoundException var8) {
            EmployeeNotFoundException e = var8;
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
