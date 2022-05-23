package basic.ch4;

import java.util.Scanner;

public class Book_demo {
    public static void main(String[] args) {
        Book ret = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入书名：");
        ret.setBook_name(sc.next());

        System.out.println("请输入出版社名：");
        ret.setPublish(sc.next());

        System.out.println("请输入作者：");
        ret.setWriters(new String[]{sc.next()});

        System.out.println("请输入书的价格：");
        ret.setPrice(sc.nextDouble());

        System.out.println("请输入书的页数：");
        ret.setPages(sc.nextInt());

        System.out.println("\n");
        ret.Print();
        ret.MakeNote("保护环境，从我做起");
    }
}
