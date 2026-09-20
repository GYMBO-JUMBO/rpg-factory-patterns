package com.world_factory.factorymethod;

public class DwarfFactory extends EnemyFactory{
    @Override 
    public Enemy createEnemy(){
        return new Dwarf();
    }
}
