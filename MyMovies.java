abstract class Movie {
    protected String title;
    protected String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public abstract String getGenre();
    public abstract int getDuration();
    public abstract String getRating();
    public abstract String getLanguage();

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Rating: " + getRating());
        System.out.println("Language: " + getLanguage());
    }
}
class ActionMovie extends Movie {
    private int duration;
    private String rating;
    private String language;

    public ActionMovie(String title, String director, int duration, String rating, String language) {
        super(title, director);
        this.duration = duration;
        this.rating = rating;
        this.language = language;
    }

    @Override
    public String getGenre() {
        return "Action";
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getRating() {
        return rating;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
class ComedyMovie extends Movie {
    private int duration;
    private String rating;
    private String language;

    public ComedyMovie(String title, String director, int duration, String rating, String language) {
        super(title, director);
        this.duration = duration;
        this.rating = rating;
        this.language = language;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getRating() {
        return rating;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
public class MyMovies {
    public static void main(String[] args) {
        System.out.println("Movie Details:\n");
        Movie lotr1 = new ActionMovie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 178, "PG-13", "English");
        Movie lotr2 = new ActionMovie("The Lord of the Rings: The Two Towers", "Peter Jackson", 179, "PG-13", "English");
        Movie lotr3 = new ActionMovie("The Lord of the Rings: The Return of the King", "Peter Jackson", 201, "PG-13", "English");
        Movie angerManagement = new ComedyMovie("Anger Management", "Peter Segal", 106, "PG-13", "English");
        Movie mrBean = new ComedyMovie("Mr. Bean's Holiday", "Steve Bendelack", 90, "G", "English");
        lotr1.displayMovieDetails();
        System.out.println();
        lotr2.displayMovieDetails();
        System.out.println();
        lotr3.displayMovieDetails();
        System.out.println();
        angerManagement.displayMovieDetails();
        System.out.println();
        mrBean.displayMovieDetails();
    }
}
