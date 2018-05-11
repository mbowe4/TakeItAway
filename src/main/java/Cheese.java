import Interfaces.Saladable;
import Interfaces.Sandwichable;


public class Cheese implements Sandwichable, Saladable {
    private String type;
    private double price;

    public Cheese(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return this.type;
    }
}
