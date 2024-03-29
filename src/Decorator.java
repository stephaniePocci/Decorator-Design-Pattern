public class Decorator implements Food {
    protected Food food;
    public Decorator(Food food) { this.food = food; }

    @Override
    public double baseCost() { return food.baseCost(); }

    @Override
    public String description() { return food.description(); }
}
