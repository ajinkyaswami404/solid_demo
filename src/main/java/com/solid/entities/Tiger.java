package com.solid.entities;

import com.solid.functions.*;
import com.solid.model.Animal;

public class Tiger extends Animal implements Eatable, Drinkable, Walkable, Swimmable, Sprintable {
    public Tiger() {
    }

    public Tiger(int id, String name, String colour, String type) {
        super(id, name, colour, type);
    }

    @Override
    public void drink() {
        System.out.println(this.getName()+" Animal can drink");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" Animal can eat");
    }

    @Override
    public void sprint() {
        System.out.println(this.getName()+" Animal can sprint");
    }

    @Override
    public void swim() {
        System.out.println(this.getName()+" Animal can swim");
    }

    @Override
    public void walk() {
        System.out.println(this.getName()+" Animal can walk");
    }
}
