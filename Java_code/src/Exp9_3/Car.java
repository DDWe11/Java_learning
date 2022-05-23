package Exp9_3;

public class Car {
    private String type;
    private double speed;

    public Car() {

    }

    public Car(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }
}
