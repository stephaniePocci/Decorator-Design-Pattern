import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void testBurgerCost() {
        Food burger = new SmashBurger();
        double expectedCost = 5.99;
        assertEquals(expectedCost, burger.baseCost(), 0.001);
    }

    @Test
    public void testCheeseTopping() {
        Food pizza = new Pizza();
        pizza = new Pepperoni(pizza);
        double expectedCost = 13.99;
        assertEquals(expectedCost, pizza.baseCost(), 0.001);
        assertEquals("Pizza with Pepperoni", pizza.description());
    }

    @Test
    public void testOrderTotalCost() {
        Order order = new Order();
        Food burger = new SmashBurger();
        burger = new SourCream(burger);
        burger = new Bacon(burger);
        order.addItem(burger);
        double expectedTotal = 7.99;
        assertEquals(expectedTotal, order.totalCost(), 0.001);
    }

    @Test
    public void testLoyaltyDiscount() {
        Order order = new Order();
        Food tacos = new Tacos();
        tacos = new SourCream(tacos);
        tacos = new Bacon(tacos);
        order.addItem(tacos);
        Loyalty loyalty = new Loyalty("Bronze");
        double expectedDiscount = 4.99 * 0.90;
        assertEquals(expectedDiscount, loyalty.discount(order), 0.001);
    }
}
