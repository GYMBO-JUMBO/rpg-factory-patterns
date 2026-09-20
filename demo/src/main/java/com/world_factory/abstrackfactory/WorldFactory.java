package com.world_factory.abstrackfactory;

public interface WorldFactory {
    Enemy createEnemy();
    Weapon createWeapon();
    Chest createChest();
}
