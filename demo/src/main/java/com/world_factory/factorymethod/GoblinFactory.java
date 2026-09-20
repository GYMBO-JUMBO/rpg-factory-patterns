package com.world_factory.factorymethod;

public class GoblinFactory extends EnemyFactory{
    @Override 
    public Enemy createEnemy(){
        return new Goblin();
    }
}
