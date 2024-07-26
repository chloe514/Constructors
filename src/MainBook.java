public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book("Jurassic Park", 400, 1990);
        Book book2 = new Book("Die Hard", 320, 1979);
        Book book3 = new Book("Seven", 350); // using title and numberOfPages constructor
        Book book4 = new Book("Mystery Book"); // using title only constructor
        Book book5 = new Book(); // using default constructor

        // Print the details of the created objects
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
    }
}

