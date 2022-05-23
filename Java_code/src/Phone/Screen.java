package Phone;

public class Screen {
    private String brand;
    private double price;

    public Screen(String brand, double price) {
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
