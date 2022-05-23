package Exp10_2;

public  class Geely extends Car{
    public Geely(String brand, double price) {
        super(brand, price);
    }

    public Geely() {
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
    public void getinfo() {
        System.out.println( "吉利" + super.toString() );
    }

}
