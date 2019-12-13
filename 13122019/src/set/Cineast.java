package set;

import java.util.HashSet;

public class Cineast {

    private String name;

    private HashSet<Movie> watched = new HashSet<>();

    public Cineast(String name, HashSet<Movie> watched) {
        this.name = name;
        this.watched = watched;
    }

    public String getName() {
        return name;
    }

    public HashSet<Movie> getWatched() {
        return watched;
    }


}
