package com.solid.entities;

import com.solid.functions.Functionality;
import com.solid.model.Bird;

public class Parrot extends Bird {
    private Functionality functionality;

    private Functionality functionality1;
    public Parrot() {
    }

    public Parrot(Functionality functionality) {
        this.functionality=functionality;
    }

    public Parrot(Functionality functionality,Functionality functionality1) {
        this.functionality=functionality;
        this.functionality1=functionality1;
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

    public void getFunctionality(){
        if (functionality1==null){
            functionality.function(this.getName());
        }
        else {
            functionality.function(this.getName());
            functionality1.function(this.getName());
        }
    }
}
