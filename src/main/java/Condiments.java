import Interfaces.Sandwichable;

public class Condiments implements Sandwichable {
    private String type;
    private double price;

    public Condiments(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
