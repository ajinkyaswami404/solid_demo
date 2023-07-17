package com.solid.entities;

import com.solid.functions.Eatable;
import com.solid.functions.Chirpable;
import com.solid.functions.Drinkable;
import com.solid.functions.Walkable;
import com.solid.functions.Swimmable;
import com.solid.model.Bird;

public class Penguin extends Bird implements Eatable, Walkable, Swimmable, Drinkable, Chirpable {

    public Penguin() {
    }

    public Penguin(int id, String name, String colour, String type) {
        super(id, name, colour, type);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " Bird can eat");
    }

    @Override
    public void drink() {
        System.out.println(this.getName() + " Bird can drink");
    }

    @Override
    public void chirp() {
        System.out.println(this.getName() + " Bird can chirp");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " Bird can walk");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " Bird can swim");
    }
}
