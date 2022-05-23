package basic.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Line_demo {
    public static void main(String[] args) {
        Line line = new Line(1.0f, 2.0f, 8.0f, 3.0f);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(line);
        System.out.println("线段的长度为：" + df.format(line.LineLength()));

        System.out.println("请输入平移位置：");
        line.Move(sc.nextFloat(), sc.nextFloat());
        System.out.println("平移后的坐标位置：");
        System.out.println(line);

        line.Rotate();
        System.out.println("旋转后坐标为：");
        System.out.println(line);
    }
}
