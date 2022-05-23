package Area_Perimeter;

public class Circle_son extends Shape_father {
    public Circle_son(double yaya) {
        super(yaya);
    }

    public double callArea() {
        return PI * yaya * yaya;
    }

    public double callPerimeter() {
        return 2 * PI * yaya;
    }

}
