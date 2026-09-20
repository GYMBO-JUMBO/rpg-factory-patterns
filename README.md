# RPG Factory Patterns

This project was created for the Software Design Patterns course.

The project demonstrates two creational design patterns:
- Factory Method
- Abstract Factory

The project uses an RPG game as an example.

## Factory Method

Factory Method is used to create different types of enemies.

There is a common `Enemy` interface and two enemy implementations: `Goblin` and `Dwarf`.

`EnemyFactory` is the main creator class. `GoblinFactory` and `DwarfFactory` create their specific enemy types.

This allows the program to work with the general `Enemy` type instead of depending directly on a specific enemy class.

## Abstract Factory

Abstract Factory is used to create different families of game objects.

There are two game worlds:
- Forest
- Volcano

Each world contains three types of objects:
- Enemy
- Weapon
- Chest

`ForestFactory` creates objects for the forest world, while `VolcanoFactory` creates objects for the volcano world.

The `GameWRLD` class works with the `WorldFactory` interface, so it does not need to know which specific objects are being created.

## Clean Code Principles

### 1. Meaningful Names

Classes and methods have names that describe their purpose.

For example:

```java
createEnemy()
createWeapon()
createChest()
```

These names make it easy to understand what each method does.

### 2. Small Methods

Methods in the project are small and have one main responsibility.

For example:

```java
public Enemy createEnemy() {
    return new ForestGoblin();
}
```

The method only creates and returns an enemy.

### 3. Small and Focused Classes

Each class has its own responsibility.

For example, `ForestFactory` creates the Forest family of objects, while `VolcanoFactory` creates the Volcano family.

### 4. Programming to Interfaces

The project uses interfaces instead of depending only on concrete classes.

For example:

```java
WorldFactory factory = new ForestFactory();
```

The variable uses the `WorldFactory` interface, so another factory can be used without changing the client logic.

### 5. No Magic Values for Object Creation

The client does not use strings such as `"forest"` or `"volcano"` to decide which products should be created.

Instead, this responsibility is handled by factory classes.

For example:

```java
WorldFactory factory = new ForestFactory();
GameWRLD world = new GameWRLD(factory);
```

## Technologies

- Java 21
- Maven
- Git