package com.solid.functions;

public class Swim implements Functionality{
    @Override
    public void function(String name) {
        System.out.println(name+" bird can swim.");
    }
}
