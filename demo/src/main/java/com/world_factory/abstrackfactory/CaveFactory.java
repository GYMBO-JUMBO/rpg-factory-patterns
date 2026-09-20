package com.world_factory.abstrackfactory;

public class CaveFactory implements WorldFactory{
    @Override
    public Enemy createEnemy() {
        return new ForestGoblin();
    }
    @Override
    public Weapon createWeapon() {
        return new WoodenBow();
    }
    @Override
    public Chest createChest() {
        return new ForestChest();
    }
}
