package excersice1;

public class person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create two instances of the Person class and set their attributes using the constructor
        person person1 = new person("Mashu", 21);
        person person2 = new person("Sakiba", 19);


        // Print their names and ages
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
