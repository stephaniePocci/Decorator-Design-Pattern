public class Loyalty {
    private final String rewards;

    public Loyalty(String rewards) {
        this.rewards = rewards;
    }

    public double discount(Order order) {
        double discountAmount = 0;
        if (rewards.equals("Bronze")) { // 10% off
            discountAmount = 0.90;
        } else if (rewards.equals("Elite")) { // 30% off
            discountAmount = 0.70;
        }
        return order.totalCost() * discountAmount;
    }
}
