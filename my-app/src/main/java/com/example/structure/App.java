package com.example.structure;

import com.example.structure.DuckTypes.MallardDuck;
import com.example.structure.DuckTypes.ModelDuck;
import com.example.structure.FlyBehaviour.FlyRocketPowered;

public class App
{
    public static void main( String[] args )
    {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
