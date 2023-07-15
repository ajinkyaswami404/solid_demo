package com.solid;

import com.solid.entities.Parrot;
import com.solid.entities.Penguin;
import com.solid.entities.Swift;
import com.solid.functions.Fly;
import com.solid.functions.Functionality;
import com.solid.functions.Swim;
import com.solid.functions.Walk;

public class Main {
    public static void main(String[] args) {

        Functionality functionality=new Fly();
        Functionality functionality1=new Walk();
        Parrot parrot=new Parrot(functionality,functionality1);
        parrot.setId(101);
        parrot.setName("Parrot");
        parrot.setColour("Green");
        parrot.setType("mid size bird");
        System.out.println("\n");
        parrot.eat();
        parrot.drink();
        parrot.chirp();
        parrot.getFunctionality();
        System.out.println(parrot.toString()+"\n");

        Functionality functionality2=new Fly();
        Swift swift=new Swift(functionality2);
        swift.setId(102);
        swift.setName("Swift");
        swift.setColour("Black");
        swift.setType("small size bird");
        swift.eat();
        swift.drink();
        swift.chirp();
        swift.getFunctionality();
        System.out.println(swift.toString()+"\n");

        Functionality functionality4=new Swim();
        Functionality functionality5=new Walk();
        Penguin penguin=new Penguin(functionality4,functionality5);
        penguin.setId(103);
        penguin.setName("Penguin");
        penguin.setColour("black and white");
        penguin.setType("big size bird.");
        penguin.eat();
        penguin.drink();
        penguin.chirp();
        penguin.getFunctionality();
        System.out.println(penguin.toString()+"\n");
    }
}