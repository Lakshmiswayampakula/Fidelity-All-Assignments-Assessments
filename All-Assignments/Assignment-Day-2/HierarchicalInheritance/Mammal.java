package assignment2.HierarchicalInheritance;

public class Mammal extends Animal {
    Mammal(String name, int age) {
        super(name, age);
    }

    void displayMammalInfo() {
        displayAnimalInfo();
        System.out.println(name + " is a mammal.");
    }

    void walk() {
        System.out.println(name + " walks on land.");
    }
}
