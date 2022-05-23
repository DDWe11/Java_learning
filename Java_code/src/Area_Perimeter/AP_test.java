package Area_Perimeter;

import java.util.Scanner;

public class AP_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的周长：");
        Shape_father shape_father = new Circle_son(sc.nextDouble());
        System.out.println("圆的面积为：" + shape_father.callArea());
        System.out.println("圆的周长为：" + shape_father.callPerimeter());
        System.out.println("请输入长方形的长和宽：");
        Shape_father retangle = new Retangle_son(sc.nextDouble(), sc.nextDouble());
        System.out.println("长方形的面积为：" + retangle.callArea());
        System.out.println("长方形的周长为：" + retangle.callPerimeter());
    }
}
