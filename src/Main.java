public class Main {
    public static void main(String[] args) {

        Food pizza = new Pizza();
         pizza = new Bacon(pizza);
         pizza = new Pepperoni(pizza);

        Order order = new Order();
        order.addItem(pizza);

        Loyalty loyalty = new Loyalty("Elite");
        double discountedTotal = loyalty.discount(order);

        String priceFormatted = String.format("%.2f", discountedTotal);

        System.out.println("Order Description:\n" + order.orderDescription());
        System.out.println("Total Cost: $" + order.totalCost());
        System.out.println("Discounted Total: $" + priceFormatted);
    }
}
