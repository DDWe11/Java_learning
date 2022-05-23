package Exp9_3;

public class Test {
    public static void main(String[] args) {
        LowCar lowCar = new LowCar("low",140);
        System.out.println(lowCar.toString());
        MidCar midCar = new MidCar("middle",180);
        System.out.println(midCar.toString());
        midCar.BluetoothConnect();
        LuxuryCar luxuryCar =new LuxuryCar("luxury",220);
        System.out.println(luxuryCar.toString());
        luxuryCar.GPS_Location();
        luxuryCar.IOVconnect();

    }
}
