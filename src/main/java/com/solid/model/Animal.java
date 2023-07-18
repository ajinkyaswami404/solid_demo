package com.solid.model;

public class Animal {

    private int id;
    private String name;
    private String colour;
    private String type;

    public Animal() {
    }

    public Animal(int id, String name, String colour, String type) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
