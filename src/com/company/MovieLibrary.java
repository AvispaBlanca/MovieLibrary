package com.company;

import java.util.ArrayList;

public class MovieLibrary {
    public ArrayList<Movie> movies;
    public MovieLibrary() {
        movies = new ArrayList();

        movies.add(
                new Movie(
                        "Star Wars New Hope",
                        new Director( "George", "Lucas"),
                        "1977",
                        "sci-fi",
                        new Actor[]{
                            new Actor ("Harrison", "Ford"),
                            new Actor("Mark", "Hamil"),
                            new Actor("Carrie", "Fisher")
                        }
                )
        );
        movies.add(
                new Movie(
                        "Star Wars Phantome Menace",
                        new Director( "George", "Lucas"),
                        "1999",
                        "sci-fi",
                        new Actor[]{
                                new Actor ("Liam", "Neeson"),
                                new Actor("Ewan", "McGregor"),
                                new Actor("Natalie", "Portman")
                        }
                )
        );
        movies.add(
                new Movie(
                        "Indiana Jones and Raiders of the Lost Ark",
                        new Director( "Steven", "Spielberg"),
                        "1981",
                        "adventure",
                        new Actor[]{
                                new Actor ("Harrison", "Ford"),
                                new Actor("Karen", "Allen")
                        }
                )
        );

        movies.add(
                new Movie(
                        "Skyfall",
                        new Director( "Sam", "Mendes"),
                        "2012",
                        "action",
                        new Actor[]{
                                new Actor ("Daniel", "Craig"),
                                new Actor("Judi", "Dench")
                        }
                )
        );

        movies.add(
                new Movie(
                        "Lara Croft: Tomb Raider",
                        new Director( "Sam", "Mendes"),
                        "2001",
                        "adventure",
                        new Actor[]{
                                new Actor("Angelina", "Jolie"),
                                new Actor ("Daniel", "Craig"),
                        }
                )
        );
    }

    public void ShowMovies(){
        for (int i = 0; i < movies.size(); i++) {
            var film = movies.get(i);
            System.out.println("Title: " + film.title);
            film.director.printDirector();
            System.out.println("Genre: " + film.genre);
            System.out.println("Year: " + film.productionYear);
            System.out.println("Cast: ");
            for (int a = 0; a < film.actors.length; a++) {
                film.actors[a].printActor();
            }
        }
    }
}