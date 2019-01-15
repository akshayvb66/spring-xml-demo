package com.stackroute.domain;

public class Movie {

    private Actor Actor;


    public Movie(com.stackroute.domain.Actor actor) {
        Actor = actor;
    }

    public Movie() {
    }

    public com.stackroute.domain.Actor getActor() {
        return Actor;
    }

    public void setActor(com.stackroute.domain.Actor actor) {
        Actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Actor=" + Actor +
                '}';
    }
}