package Exp9_3;

public class LuxuryCar extends MidCar implements Bluetooth,GPS,IOV{
    public LuxuryCar() {
    }

    public LuxuryCar(String type, double speed) {
        super(type, speed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void BluetoothConnect() {
        super.BluetoothConnect();
    }

    @Override
    public void BluetoothDisConnect() {
        super.BluetoothDisConnect();
    }

    @Override
    public void GPS_Location() {
        System.out.println(this.getType()+"获取GPS信息");
    }

    @Override
    public void IOVconnect() {
        System.out.println(this.getType()+"IOV已经联网");
    }

    @Override
    public void IOVDisConnect() {
        System.out.println(this.getType()+"IOV已经断开网络");
    }
}
