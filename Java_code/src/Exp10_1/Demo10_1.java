package Exp10_1;

public class Demo10_1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0,5.0);
        Shape circle = new Circle(15.0);
        System.out.println("==============测试长方形Rectangle类==============");
        MyShape.area( rectangle );
        MyShape.perimeter( rectangle );
        MyShape.drawing( rectangle );
        System.out.println("==============测试圆Circle类==============");
        MyShape.area( circle );
        MyShape.perimeter( circle );
        MyShape.drawing( circle );
    }
}
