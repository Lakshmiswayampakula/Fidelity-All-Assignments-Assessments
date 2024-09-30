package assignment2.HierarchicalInheritance;

    class Goldfish extends Fish {
        Goldfish(String name, int age) {
            super(name, age);
        }

        @Override
        void makeSound() {
            System.out.println(name + " does not make a sound.");
        }
    }
