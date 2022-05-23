package basic.ch2;

import java.util.Scanner;

public class ch2_demo_5 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("**************学生管理系统***************");
            System.out.println("-----1.查询------------------2.增加-----");
            System.out.println("-----3.修改------------------4.删除-----");
            System.out.println("-----0.退出");
            System.out.println("请输入菜单号：");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            if (command == 1) {
                System.out.println("查询学生信息：");
            } else if (command == 2) {
                System.out.println("增加学生信息：");
            } else if (command == 3) {
                System.out.println("修改学生信息：");
            } else if (command == 4) {
                System.out.println("删除学生信息：");
            } else if (command == 0) {
                System.exit(0);
            } else {
                System.out.println("请重新输入正确的菜单号");
            }
        }
    }
}
