public class SmashBurger implements Food {
    @Override
    public double baseCost() {
        return 5.99;
    }

    @Override
    public String description() { return "Smash Burger"; }
}
