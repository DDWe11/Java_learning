package basic.ch4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle_demo {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1,2,3,3,1,3);
        Triangle tri2 = new Triangle(1,2,3,3,1,3);
        Scanner sc =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("原始坐标为：");
        System.out.println(tri);
        System.out.println("三角形的周长为： "+df.format(tri.Perimeter()));
        System.out.println("三角形的面积为： "+df.format(tri.TriangleArea()));
        System.out.println("请输入平移的位置（先左右移动x，后上下y）：");
        tri.Move(sc.nextInt(),sc.nextInt());
        System.out.print("移动后的坐标：");
        System.out.println(tri);

        tri2.Spin();
        System.out.print("旋转后的坐标：");
        System.out.println(tri2);
    }
}
