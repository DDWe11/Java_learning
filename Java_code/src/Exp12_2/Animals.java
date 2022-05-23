package Exp12_2;

public class Animals {
    private double weight;
    private double height;
    private String BodyColor;

    public Animals(double weight, double height, String bodyColor) {
        this.weight = weight;
        this.height = height;
        BodyColor = bodyColor;
    }

    @Override
    public String toString() {
        return " weight:" + weight +
                "   height:" + height +
                "   BodyColor:" + BodyColor  ;
    }
}
