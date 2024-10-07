package project;

//main class
public class PayrollManagmentSystem {
    public static void main(String[] args) {
        PermanentEmployee permEmp = new PermanentEmployee(101, "Lakshmi", 45000, 3000, 3000);

        permEmp.calculateSalary();

        System.out.println("permanent Employee Details:");
        permEmp.display();
        TemporaryEmployee tempEmp = new TemporaryEmployee(102, "teju", 35000, 500);
        tempEmp.calculateSalary();
        tempEmp.display();
        System.out.println("temporary Employee Details:");


    }
}
