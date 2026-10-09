import java.util.Arrays;
import java.util.List;

public class RecipeApp {
    public static void showPlan(CookingPlan plan) {
        System.out.println("Dish: " + plan.getDishName());

        for (String instruction : plan.cook()) {
            System.out.println(instruction);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        List<CookingPlan> plans = Arrays.asList(
            new OvenPlan("Demo Dish"),
            new StovetopPlan("Demo Dish"),
            new CampingPlan("Demo Dish")
        );

        for (CookingPlan plan : plans) {
            showPlan(plan);
        }

        CookingPlan trailMeal = new OvenPlan("Trail Meal");
        showPlan(trailMeal);

        System.out.println("Repeated calls match: "
            + trailMeal.cook().equals(trailMeal.cook()));

        try {
            new OvenPlan("");
        } catch (IllegalArgumentException e) {
            System.out.println("Empty name rejected.");
        }

        try {
            new CampingPlan("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Whitespace name rejected.");
        }
    }
}
