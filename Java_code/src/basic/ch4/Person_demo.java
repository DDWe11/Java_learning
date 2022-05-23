package basic.ch4;

import java.util.Scanner;

public class Person_demo {
    public static void main(String[] args) {
        Person sun = new Person();
        Scanner scn = new Scanner(System.in);
        sun.id_code = "54188";
        sun.name = "二狗";
        sun.sex = "女";
        sun.age = 18;
        sun.native_place = "河南省郑州";
        sun.address = "天津市北辰区北仓镇富锦华庭";

        System.out.println("请输入喜欢吃的食物：");
        String food;
        food = scn.next();

        System.out.println("请输入要购买的商品：");
        String goods;
        goods = scn.next();

        System.out.println("请输入睡觉的时间：");
        int time;
        time = scn.nextInt();

        System.out.println("请输入修改人的姓名：");
        String aName;
        aName = scn.next();

        System.out.println("请输入修改人的年龄：");
        int aAge;
        aAge = scn.nextInt();

        System.out.println("\n");

        System.out.println("信息如下：");

        sun.setName(aName);
        sun.setAge(aAge);
        sun.printPerson();
        sun.eating(food);
        sun.shopping(goods);
        sun.sleeping(time);
    }
}
