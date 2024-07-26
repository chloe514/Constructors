

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor to initialize name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor to initialize name only (default isDog to false)
    public Animal(String name) {
        this(name, false);
    }

    // Default constructor (default name to "Unknown" and isDog to false)
    public Animal() {
        this("Unknown", false);
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // toString method to print the animal details
    @Override
    public String toString() {
        return "Animal Name: " + name + ", Is Dog: " + (isDog ? "Yes" : "No");
    }
}





