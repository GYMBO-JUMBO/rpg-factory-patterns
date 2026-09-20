package com.world_factory.factorymethod;

public class Dwarf implements Enemy{
    @Override 
    public void attack(){
        System.out.println("Dwarf attacks with a sword!");
    }
}
