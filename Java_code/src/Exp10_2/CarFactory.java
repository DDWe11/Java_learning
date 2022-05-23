package Exp10_2;
/*定义汽车工厂类CarFactory,该类中有一个静态方法getCar(String name),
根据用户指定的车型来创建对象，利用简单工厂模式完成。
 */
import java.util.Scanner;

public class CarFactory {
    public static void getCar(String name) {
        Scanner sc =new Scanner(System.in);
        Car redcar = new RedCar();
        System.out.println("请输入红旗汽车的型号：");
        redcar.setBrand(sc.next());
        System.out.println("请输入红旗汽车的价格：");
        redcar.setPrice(sc.nextDouble());
        redcar.getinfo();

        Car geely = new Geely() ;
        System.out.println("请输入吉利汽车的型号：");
        geely.setBrand(sc.next());
        System.out.println("请输入吉利汽车的价格：");
        geely.setPrice(sc.nextDouble());
        geely.getinfo();
    }
}
