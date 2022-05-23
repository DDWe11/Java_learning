package Exp10_1;

public abstract class MyShape {
    public static void area(Shape shape) {
        System.out.println( shape.getArea() );
    }
    public static void perimeter(Shape shape) {
        System.out.println( shape.getPerimeter() );
    }
    public static void drawing(Shape shape) {
        System.out.println( shape.drawing() );
    }
}
