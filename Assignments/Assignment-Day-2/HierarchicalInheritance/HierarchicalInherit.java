package assignment2.HierarchicalInheritance;

public class HierarchicalInherit {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        Parrot parrot = new Parrot("Polly", 2);
        Goldfish goldfish = new Goldfish("Goldie", 1);

        System.out.println("Dog Information:");
        dog.displayMammalInfo();
        dog.makeSound();
        dog.walk();

        System.out.println("\nParrot Information:");
        parrot.displayBirdInfo();
        parrot.makeSound();
        parrot.fly();

        System.out.println("\nGoldfish Information:");
        goldfish.displayFishInfo();
        goldfish.makeSound();
        goldfish.swim();
    }
}
