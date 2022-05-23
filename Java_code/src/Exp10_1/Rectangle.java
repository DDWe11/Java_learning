package Exp10_1;
/*定义长方形类Rectangle实现接口Shape，成员变量包括长length和宽width，
定义一个初始化所有成员变量的构造方法，重写toString()返回长方形的length和width，并重写接口中的方法。
 */
public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String getArea(){
        return "长方形的面积："+width*length;
    }

    public String  getPerimeter(){
        return "长方形的周长："+ 2*(length*width);
    }

    public String drawing(){
        return "正在绘制一个长方形"+"长："+length+"宽："+width;
    }

}
