package Exp10_2;

public class RedCar extends Car{
    public RedCar(String brand, double price) {
        super(brand, price);
    }

    public RedCar() {
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "RedCar{} " + super.toString();
    }

    @Override
    public void getinfo() {
        System.out.println( "红旗" + super.toString() );
    }
}
