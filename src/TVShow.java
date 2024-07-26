

public class TVShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor to initialize showName, numberOfEpisodes, and genre
    public TVShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Constructor to initialize showName and numberOfEpisodes (default genre to "Unknown")
    public TVShow(String showName, int numberOfEpisodes) {
        this(showName, numberOfEpisodes, "Unknown");
    }

    // Constructor to initialize showName only (default numberOfEpisodes to 1 and genre to "Unknown")
    public TVShow(String showName) {
        this(showName, 1, "Unknown");
    }

    // Default constructor (default showName to "Unknown", numberOfEpisodes to 1, and genre to "Unknown")
    public TVShow() {
        this("Unknown", 1, "Unknown");
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Show Name: " + getShowName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre();
    }
}




