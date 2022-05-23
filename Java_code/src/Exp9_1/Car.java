package Exp9_1;
/*(1)私有成员变量包括汽车品牌brand，排气量emission和价格price；(2)定义一个构造方法初始化所有成员变量；
(3)定义getBrand()方法返回品牌信息;(4)功能方法包括：starting()方法启动发动机。
 */
public class Car {
    private String brand;
    private double emission;
    private double price;

    public Car(String brand, double emission, double price) {
        this.brand = brand;
        this.emission = emission;
        this.price = price;
    }
    public  String getBrand(){
        return this.brand;
    }
    public String starting(){
        return "Staring "+this.brand+" engine";
    }
}
