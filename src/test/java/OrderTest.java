import Interfaces.SandwichBase;
import Interfaces.Sandwichable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class OrderTest {

    @Test
    public void addSandwichToOrderTest() {
        Order order = new Order();
        Sandwich sandwich = new Sandwich(new Bread("Onion Rye", 0.00), new SandwichBase("") {
        })
        order.addMenuItem(new Sandwich(new Bread(), new Meat(), new ArrayList<Sandwichable>()));

        Assert.assertTrue(order.getMenuItems().size() == 1);
        System.out.println(order.toString());
    }

}
