package com.world_factory;
import com.world_factory.factorymethod.Enemy;
import com.world_factory.factorymethod.EnemyFactory;
import com.world_factory.factorymethod.GoblinFactory;
import com.world_factory.factorymethod.DwarfFactory;
public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new GoblinFactory();
        Enemy enemy = factory.createEnemy();
        enemy.attack();
        factory = new DwarfFactory();
        enemy = factory.createEnemy();
        enemy.attack();
    }
}