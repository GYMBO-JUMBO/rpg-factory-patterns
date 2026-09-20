package com.world_factory.abstrackfactory;

public class GameWRLD {
    private final Enemy enemy;
    private final Weapon weapon;
    private final Chest chest;
    public GameWRLD(WorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.weapon = factory.createWeapon();
        this.chest = factory.createChest();
    }
    public void play() {
        enemy.attack();
        weapon.use();
        chest.open();
    }
}
