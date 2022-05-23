package Exp12_2;

public class Lion extends Animals implements IBehavior{
    private int toothNumber;
    private double tailength;

    public Lion(double weight, double height, String bodyColor, int toothNumber, double tailength) {
        super(weight, height, bodyColor);
        this.toothNumber = toothNumber;
        this.tailength = tailength;
    }

    @Override
    public void walking() {
        System.out.println("Lion is running!");
    }

    @Override
    public void eating(String food) {
        System.out.println("Lion is eating "+food);
    }

    @Override
    public String toString() {
        return "Lion:" +super.toString()+
                "   toothNumber=" + toothNumber +
                "   tailength=" + tailength ;
    }
}
