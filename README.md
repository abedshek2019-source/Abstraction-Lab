# Abstraction-Lab

## Running Instructions

Compile and run the program from the project folder:

```bash
javac src/*.java
java -cp src RecipeApp
```

## Sample Output

```text
Dish: Demo Dish
Prepare the oven and baking dish.
Place Demo Dish in the baking dish.
Bake using the recipe's oven instructions.

Dish: Demo Dish
Prepare the stovetop and pan.
Place Demo Dish in the pan.
Cook using the recipe's stovetop instructions.

Dish: Demo Dish
Prepare the portable stove and camping pot.
Place Demo Dish in the camping pot.
Cook using the recipe's portable-stove instructions.

Dish: Trail Meal
Prepare the oven and baking dish.
Place Trail Meal in the baking dish.
Bake using the recipe's oven instructions.

Repeated calls match: true
Empty name rejected.
Whitespace name rejected.
```

## Pathway Explanation

The program uses an abstract `CookingPlan` class as a shared contract. `OvenPlan`, `StovetopPlan`, and `CampingPlan` extend it and each provide their own `cook()` method. The `showPlan(CookingPlan plan)` method works with any subclass without needing to check its type.

## Possible Abstraction in My Current Project

In my basketball training tracker, I could create an abstract `TrainingPlan` class with subclasses such as `ShootingPlan`, `DefensePlan`, and `ConditioningPlan`. Each subclass could provide different training instructions while the program uses one shared method to display them.
## UML Diagram

![UML Class Diagram](cooking_plan_uml%20(1).png)
