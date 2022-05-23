package Exp10_1;
/*定义圆类Circle实现Shape接口，成员变量半径radius，定义一个初始化所有成员变量的构造方法，
重写toString()返回圆的半径radius，并重写接口中的方法。
 */
import java.text.DecimalFormat;
public class Circle implements Shape{
    private double radius;
    public static final double PI=3.14;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public String  getArea(){
         return "圆的表面积："+ radius*radius*PI;
    }
    public String getPerimeter(){
        return "圆的周长："+df.format(radius*2*PI);
    }
    public String drawing(){
        return "正在画半径为"+radius+"的圆";
    }
}
