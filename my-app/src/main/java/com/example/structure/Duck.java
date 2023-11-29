package com.example.structure;

public abstract class Duck
{
    public void quack(){
        System.out.println("Quack quack!!");
    }
    void swim(){
        System.out.println("Swimmingg!!");
    }
    void fly(){
        System.out.println("I can fly!!");
    }
    public abstract void display();
}
