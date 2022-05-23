package basic.ch4;

import java.util.Scanner;

public class Number_demo {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        number.setNum(num);

        System.out.println(num + " 这个整数的累加为：" + number.Cumulation());
        number.isprime();
    }
}
