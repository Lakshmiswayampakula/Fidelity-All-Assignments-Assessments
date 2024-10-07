package assignment2.HierarchicalInheritance;

public class Fish extends Animal {
    Fish(String name, int age) {
        super(name, age);
    }

    void displayFishInfo() {
        displayAnimalInfo();
        System.out.println(name + " is a fish.");
    }

    void swim() {
        System.out.println(name + " swims in water.");
    }
}
