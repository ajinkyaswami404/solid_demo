package com.solid.entities;

import com.solid.functions.Chirpable;
import com.solid.functions.Drinkable;
import com.solid.functions.Eatable;
import com.solid.functions.Flyable;
import com.solid.model.Bird;

public class Swift extends Bird implements Drinkable, Flyable, Eatable, Chirpable {

    public Swift() {
    }

    public Swift(int id, String name, String colour, String type) {
        super(id, name, colour, type);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" Bird can eat");
    }

    @Override
    public void drink() {
        System.out.println(this.getName()+" Bird can drink");
    }

    @Override
    public void chirp() {
        System.out.println(this.getName()+" Bird can chirp");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" Bird can fly");
    }
}
