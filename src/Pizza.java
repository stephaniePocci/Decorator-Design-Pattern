public class Pizza implements Food {
    @Override
    public double baseCost() {
        return 12.99;
    }

    @Override
    public String description() { return "Pizza"; }
}

