package inherit.animals;

public class Pig extends Animals{
    private double length;
    private double height;
    private String color;

    public Pig(String name, int age, char sex, int legnum, double weight, double length, double height, String color) {
        super(name, age, sex, legnum, weight);
        this.length = length;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pig{" + "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", legnum=" + legnum +
                ", weight=" + weight +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public void eating(String food){
        System.out.println("pig is eating "+food);
    }
    public void walking(){
        System.out.println("pig is walking");
    }
}
