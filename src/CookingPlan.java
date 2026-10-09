import java.util.List;

public abstract class CookingPlan {
    private String dishName;

    protected CookingPlan(String dishName) {
        if (dishName == null || dishName.trim().isEmpty()) {
            throw new IllegalArgumentException("Dish name cannot be blank");
        }
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public abstract List<String> cook();
}
