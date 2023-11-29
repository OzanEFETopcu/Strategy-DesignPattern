package com.example.structure.DuckTypes;

import com.example.structure.Duck;
import com.example.structure.FlyBehaviour.FlyWithWings;
import com.example.structure.QuackBehaviour.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a Mallard!!!");
    }
}
