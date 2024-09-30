package assignment2.HierarchicalInheritance;

public class Dog extends Mammal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }
}

