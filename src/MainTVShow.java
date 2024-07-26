public class MainTVShow {
    public static void main(String[] args) {
        TVShow show1 = new TVShow("Friends", 236, "Comedy");
        TVShow show2 = new TVShow("Law and Order", 456, "Crime");
        TVShow show3 = new TVShow("Criminal Minds", 324); // using showName and numberOfEpisodes constructor
        TVShow show4 = new TVShow("Unknown Show"); // using showName only constructor
        TVShow show5 = new TVShow(); // using default constructor

        // Print the details of the created objects
        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);
        System.out.println(show4);
        System.out.println(show5);
    }
}

