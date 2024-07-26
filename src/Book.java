

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor to initialize title, numberOfPages, and publicationYear
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Constructor to initialize title and numberOfPages (default publicationYear to 2024)
    public Book(String title, int numberOfPages) {
        this(title, numberOfPages, 2024); // Assuming the current year is 2024
    }

    // Constructor to initialize title only (default numberOfPages to 100 and publicationYear to 2024)
    public Book(String title) {
        this(title, 100, 2024); // Assuming 100 pages and the current year is 2024
    }

    // Default constructor (default title to "Unknown", numberOfPages to 100, and publicationYear to 2024)
    public Book() {
        this("Unknown", 100, 2024); // Assuming 100 pages and the current year is 2024
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }
}






