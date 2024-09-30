package assignment2;

public class PersonDetails {
    private String name;
    public String gender;
    public int age;

    public PersonDetails(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonDetails personDetails = new PersonDetails("John", "Male", 25);
        personDetails.displayPersonDetails();
    }
}
