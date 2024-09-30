package assignment2.HierarchicalInheritance;

public class Animal {
    // Base class
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayAnimalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

