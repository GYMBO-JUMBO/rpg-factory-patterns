package com.world_factory.abstrackfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        WorldFactory factory = new ForestFactory();
        GameWRLD world = new GameWRLD(factory);
        System.out.println("<=== FOREST WORLD ===>");
        world.play();
        factory = new CaveFactory();
        world = new GameWRLD(factory);
        System.out.println("\n<=== CAVE WORLD ===>");
        world.play();
    }
}
