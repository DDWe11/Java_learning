package Exp12_1;

public class Fan extends Equipment{
    private double power;

    public Fan(String name, double power) {
        super(name);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Name:" +this.getName()+
                "   power=" + this.power +
                "P} ";
    }
}
