package com.solid.model;

import com.solid.functions.Birds;

public abstract class Bird implements Birds {
    private int id;
    private String name;
    private String colour;
    private String type;

    public Bird() {
    }

    public Bird(int id, String name, String colour, String type) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.type = type;
    }

    @Override
    abstract public void eat();

    @Override
    abstract public void drink();

    @Override
    abstract public void chirp();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
