package Exp12_1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input product's name:");
        Equipment equipment = My_Factory.getInstance(sc.next());
        System.out.println(equipment);
    }
}
