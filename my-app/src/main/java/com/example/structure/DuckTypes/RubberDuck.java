package com.example.structure.DuckTypes;

import com.example.structure.Duck;

public class RubberDuck extends Duck {

    @Override
    public void quack(){
        System.out.println("I can only Squeak!!!");
    }

    public void display() {
        System.out.println("I am a Redhead!!!");
    }
}
