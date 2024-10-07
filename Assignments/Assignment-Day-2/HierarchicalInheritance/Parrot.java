package assignment2.HierarchicalInheritance;

public class Parrot extends Bird {
    Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " squawks.");
    }
}
