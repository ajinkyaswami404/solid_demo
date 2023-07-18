package com.solid;

import com.solid.entities.Parrot;
import com.solid.entities.Penguin;
import com.solid.entities.Swift;
import com.solid.entities.Tiger;
import com.solid.functions.Walkable;
import com.solid.model.Bird;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Parrot parrot=new Parrot();
        parrot.setId(101);
        parrot.setName("Parrot");
        parrot.setColour("Green");
        parrot.setType("mid size bird");
        System.out.println("\n");
        parrot.eat();
        parrot.drink();
        parrot.chirp();
        System.out.println(parrot.toString()+"\n");

        Swift swift=new Swift();
        swift.setId(102);
        swift.setName("Swift");
        swift.setColour("Black");
        swift.setType("small size bird");
        swift.eat();
        swift.drink();
        swift.chirp();
        System.out.println(swift.toString()+"\n");

        Penguin penguin=new Penguin();
        penguin.setId(103);
        penguin.setName("Penguin");
        penguin.setColour("black and white");
        penguin.setType("big size bird.");
        penguin.eat();
        penguin.drink();
        penguin.chirp();
        System.out.println(penguin.toString()+"\n");

        Tiger tiger=new Tiger(202,"Tiger","Yellow","carnivores");
        tiger.drink();
        tiger.eat();
        tiger.sprint();
        tiger.swim();
        tiger.walk();
        System.out.println(tiger.toString()+"\n");

        List<Bird> birdList=new ArrayList<>();
        List<Walkable> walkList=new ArrayList<>();
        birdList.add(parrot);
        birdList.add(penguin);
        birdList.add(swift);

        for(int i=0;i< birdList.size();i++){
            if (birdList.get(i) instanceof Walkable){
                walkList.add(i, (Walkable) birdList.get(i));
            }
        }
        System.out.println("Walkable birds are "+walkList);
    }
}