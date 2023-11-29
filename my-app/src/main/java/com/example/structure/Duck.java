package com.example.structure;

import com.example.structure.FlyBehaviour.FlyBehaviour;
import com.example.structure.QuackBehaviour.QuackBehaviour;

public abstract class Duck
{

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    void swim(){
        System.out.println("Swimmingg!!");
    }
    void performQuack(){
        quackBehaviour.quack();
    }
    void performFly(){
        flyBehaviour.fly();
    }
    void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    public abstract void display();
}
