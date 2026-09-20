package com.world_factory.factorymethod;

public class Goblin implements Enemy {
    @Override 
    public void attack(){
        System.out.println("Goblin attacks with a bow!");
    }
}
