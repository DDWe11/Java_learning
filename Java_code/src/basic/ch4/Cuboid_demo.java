package basic.ch4;

import java.text.DecimalFormat;

public class Cuboid_demo {
    public static void main(String[] args) {
        Cuboid ret = new Cuboid();

        System.out.println("-------Test 1-------");
        Cuboid cuboidA = new Cuboid();
        //设置长宽高
        cuboidA.setLength(1.5);
        cuboidA.setWidth(2.6);
        cuboidA.setHeight(18.6);
        //调用方法输出信息
        cuboidA.printCuboid();
        //调用isCube判断是否正方体
        cuboidA.isCube();
        boolean flag = cuboidA.isCube();
        if (flag == true) {
            System.out.println("cuboidA is a cube");
        } else System.out.println("cuboidA isn't a cube");
        //调用drawing方法
        Cuboid dr = new Cuboid();
        dr.drawing();
//        cuboidA.printCuboid();

        System.out.println();
        System.out.println("-------Test 2-------");
        Cuboid cuboidB = new Cuboid();
        //设置第二组长宽高
        cuboidB.setLength(2.5);
        cuboidB.setWidth(6.8);
        cuboidB.setHeight(8.0);
        //用setLength()修改数据
        cuboidB.setLength(4.6);
        DecimalFormat df = new DecimalFormat("#0.00");
        //调用getArea求面积
        cuboidB.getArea();
        double area = cuboidB.getArea();
        System.out.println("AREA of cuboidB is " + df.format(area));
        //调用getCubage求体积
        cuboidB.gerCubage();
        double volume = cuboidB.gerCubage();
        System.out.println("VOLUME of cuboidB is " + df.format(volume));
    }
}
