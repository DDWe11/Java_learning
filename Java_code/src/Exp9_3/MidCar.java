package Exp9_3;

public class MidCar extends LowCar implements Bluetooth{
    public MidCar() {
    }

    public MidCar(String type, double speed) {
        super(type, speed);
    }

    @Override
    public String toString() {
        return   super.toString();
    }
    public void BluetoothConnect(){
        System.out.println(this.getType()+"蓝牙已连接");
    }
    public void BluetoothDisConnect(){
        System.out.println(this.getType()+"蓝牙已断开连接");
    }
}
