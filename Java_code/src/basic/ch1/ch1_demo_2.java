package basic.ch1;

import java.util.Scanner;

public class ch1_demo_2 {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        String origin;

        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name:");
        name = sc.next();
        System.out.println("please input your age:");
        age = sc.nextInt();
        System.out.println("please input your height:");
        height = sc.nextFloat();
        System.out.println("please input your origin:");
        origin = sc.next();
        System.out.println("name: " + name + "\nage: " + age + "\nheight: " + height + "cm" + "\norigin: " + origin);
    }
}
