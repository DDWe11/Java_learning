package Area_Perimeter;

public class Retangle_son extends Shape_father {
    double width;

    public Retangle_son(double yaya, double width) {
        super(yaya);
        this.width = width;
    }

    public double callArea() {
        return yaya * width;
    }

    public double callPerimeter() {
        return 2 * (yaya + width);
    }


}
