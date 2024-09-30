package assignment2.MultilevelInheritance;

public class MultilevelInherit {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 40, "M123", 90000, "IT");

        System.out.println("Manager Information:");
        manager.displayManagerInfo();
    }
}
