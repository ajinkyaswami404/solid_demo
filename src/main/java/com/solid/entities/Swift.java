package com.solid.entities;

import com.solid.functions.Functionality;
import com.solid.model.Bird;

public class Swift extends Bird {

    private Functionality functionality;
    public Swift() {
    }

    public Swift(Functionality functionality) {
        this.functionality=functionality;
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
        functionality.function(this.getName());
    }
}
