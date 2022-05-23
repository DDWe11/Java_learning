package Exp12_1;

public class Refrigerator extends Equipment{
    private double volume;

    public Refrigerator(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Name:" +this.getName()+
                "   volume=" + this.volume +
                "L} ";
    }
}
