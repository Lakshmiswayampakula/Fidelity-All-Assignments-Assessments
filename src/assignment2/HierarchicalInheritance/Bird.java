package assignment2.HierarchicalInheritance;

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void displayBirdInfo() {
        displayAnimalInfo();
        System.out.println(name + " is a bird.");
    }

    void fly() {
        System.out.println(name + " flies in the sky.");
    }
}
