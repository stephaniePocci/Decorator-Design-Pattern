public class SourCream extends Decorator {
    public SourCream(Food food) { super(food); }

    @Override
    public double baseCost() {
        double toppingCost = 1.00;
        return super.baseCost() + toppingCost;
    }

    @Override
    public String description() { return super.description() + " with Sour Cream"; }
}
