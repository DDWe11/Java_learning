package Phone;

public class Mainboard {
    private String brand;
    private double price;

    public Mainboard(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
