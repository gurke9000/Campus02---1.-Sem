package set;

import java.util.Objects;

public class Movie {

    private String title;
    private int dauer;
    private int releaseDate;
    private String genre;

    public Movie(String title, int dauer, int releaseDate, String genre) {
        this.title = title;
        this.dauer = dauer;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDauer() {
        return dauer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseDate == movie.releaseDate &&
                Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseDate);
    }

    @Override
    public String toString() {
        return "set.Movie{" +
                "title='" + title + '\'' +
                ", dauer=" + dauer +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                '}';
    }
}
