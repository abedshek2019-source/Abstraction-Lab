# Abstraction-Lab
## Overview

This project demonstrates abstraction and polymorphism in Java. It uses an abstract `CookingPlan` class and three subclasses: `OvenPlan`, `StovetopPlan`, and `CampingPlan`.

Each subclass has its own `cook()` method that returns three cooking instructions. The `RecipeApp` uses `showPlan(CookingPlan plan)` to display any cooking plan.

## How to Run

Compile the Java files:

```bash
javac src/*.java
```

Run the program:

```bash
java -cp src RecipeApp
```

## Testing

The program tests all three cooking plans with `Demo Dish`. It also tests `Trail Meal`, repeated calls to `cook()`, and rejection of empty or whitespace-only dish names.

The abstract `CookingPlan` class cannot be instantiated directly, which is tested separately.

## UML Diagram

The class diagram shows `CookingPlan` and its three subclasses. Each subclass inherits from `CookingPlan` and implements its own `cook()` method.

## Adding Another Cooking Plan

To add an `AirFryerPlan`, I would create a new class that extends `CookingPlan` and overrides `cook()`. The existing `showPlan()` method would still work without changes because it accepts a `CookingPlan` object.

## Connection to My Basketball Training Tracker

My basketball training tracker could use an abstract `TrainingPlan` class with subclasses such as `ShootingPlan`, `DefensePlan`, and `ConditioningPlan`. Each subclass could provide different training instructions while using one shared method to display them.
