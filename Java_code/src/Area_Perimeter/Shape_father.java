package Area_Perimeter;

public abstract class Shape_father {
    final double PI = 3.14;
    double yaya;

    public Shape_father(double yaya) {
        this.yaya = yaya;
    }

    public abstract double callArea();

    public abstract double callPerimeter();
}
