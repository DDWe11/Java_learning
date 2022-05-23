package basic.ch4;

import java.util.Scanner;

public class Fraction_demo {
    public static void main(String[] args) {
        Fraction frac = new Fraction();
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("------------请选择要进行的运算-------------");
        System.out.println("---1.加法     2.减法    3.乘法    4.除法---");
        x = sc.nextInt();
        System.out.println("请输入第一个分数的分子,分母（用空格隔开）：");
        frac.setMol1(sc.nextInt());
        frac.setDenom1(sc.nextInt());
        System.out.println("请输入第二个分数的分子，分母（用空格隔开）：");
        frac.setMol2(sc.nextInt());
        frac.setDenom2(sc.nextInt());
        switch (x) {
            case 1 -> {
                System.out.println("运算...");
                frac.fAdd();
            }
            case 2 -> {
                System.out.println("运算...");
                frac.fSub();
            }
            case 3 -> {
                System.out.println("运算...");
                frac.fMul();
            }
            case 4 -> {
                System.out.println("运算...");
                frac.fDiv();
            }
            default -> System.out.println("请输入1-4：");
        }
    }
}

