package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        MovieLibrary FilmBase = new MovieLibrary();

        FilmBase.ShowMovies();

        System.out.println("Press \"ENTER\" to close...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}