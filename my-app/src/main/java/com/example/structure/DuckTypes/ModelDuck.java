package com.example.structure.DuckTypes;

import com.example.structure.Duck;
import com.example.structure.FlyBehaviour.FlyNoWay;
import com.example.structure.QuackBehaviour.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I am a model duck!");
    }
}
