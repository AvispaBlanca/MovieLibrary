package com.company;

public class Actor {
    public String name;
    public String surname;

    public Actor (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printActor(){
        System.out.println(name + " " + surname);
    }

}


