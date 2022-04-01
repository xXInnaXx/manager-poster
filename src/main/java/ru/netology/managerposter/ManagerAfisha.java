package ru.netology.managerposter;

public class ManagerAfisha {
    private String[] movies = new String[0];
    private int moviesCount;

    public ManagerAfisha() {
        moviesCount = 10;
    }

    public ManagerAfisha(int moviesCount) {
        this.moviesCount = moviesCount;
    }

    public void add(String movie) {
        int length = movies.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[length - 1] = movie;
        movies = tmp;
    }

    public String[] getLastMovies() {
        String[] tmp;
        int length = movies.length;
        int edge;
        if (length < moviesCount) {
            edge = 0;
            tmp = new String[length];
        } else {
            edge = length - moviesCount;
            tmp = new String[moviesCount];
        }
        for (int i = length - 1; i >= edge; i--) {
            tmp[length - 1 - i] = movies[i];
        }
        return tmp;
    }
}


