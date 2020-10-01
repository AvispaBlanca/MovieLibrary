package com.company;

public class Director {
    public String name;
    public String surname;

    public Director (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void printDirector(){
        System.out.println("Director: " + name + " " + surname );
    }

}
