package com.company;

public class Movie {
    public String title;
    public Director director;
    public String productionYear;
    public String genre;
    public Actor[] actors;

    public Movie (String title, Director director, String productionYear, String genre, Actor[] actors){
        this.title = title;
        this.director = director;
        this.productionYear = productionYear;
        this.genre = genre;
        this.actors = actors;

    }
}