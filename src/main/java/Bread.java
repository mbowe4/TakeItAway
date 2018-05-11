public class Bread  {
    private String type;
    private double price;

    Bread(String type, double price) {
        this.type = type;
        this.price = price;
    }

    Bread(String type) {
        this(type, 0.00);
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
