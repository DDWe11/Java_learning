package Exp10_2;
/*定义抽象类Car，成员变量品牌brand和价格price，
构造方法能够初始化所有成员变量，省略setter和getter方法，
重写toString()方法返回有意义的汽车信息，抽象方法getInfo()返回汽车信息。
 */
public abstract class Car {
    private String brand;
    private double price;

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "型号：" + brand + ", 价格" + price ;
    }
    abstract public void getinfo();
}
