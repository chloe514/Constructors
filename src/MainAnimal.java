public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Zooey", true);
        Animal animal2 = new Animal("Bluey", false);
        Animal animal3 = new Animal("Snoopy"); // using name-only constructor
        Animal animal4 = new Animal(); // using default constructor

        // Print the details of the created objects
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}

