import java.util.ArrayList;
import java.util.List;
public class Order {
    private final List<Food> meal = new ArrayList<>();

    public void addItem(Food food) {
        meal.add(food);
    }

    public double totalCost() {
        double total = 0;
        for (Food food : meal) {
            total += food.baseCost();
        }
        return total;
    }

    public String orderDescription() {
        StringBuilder mealDescription = new StringBuilder();
        for (Food food : meal) {
            mealDescription.append(food.description()).append("\n");
        }
        return mealDescription.toString();
    }
}
