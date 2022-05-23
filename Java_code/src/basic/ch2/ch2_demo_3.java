package basic.ch2;

import java.util.Scanner;

public class ch2_demo_3 {
    public static void main(String[] args) {
        String code;
        int numbs = 0, price = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input your code numbers:");
            code = sc.next();
            if ("over".equalsIgnoreCase(code)) {
                break;
            }
            price += 2;
            if ("f".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 1st prize\n");
                numbs += 1;
                continue;
            }
            if ("t".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 2nd prize\n");
                numbs += 1;
                continue;
            }
            if ("s".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 3rd prize\n");
                numbs += 1;
                continue;
            } else {
                System.out.println("sorry,you didn't win the prize\n");
                numbs += 1;
                continue;
            }
        }
        System.out.println("numbs\t" + numbs);
        System.out.println("price\t" + price);
    }
}

