package basic.ch2;

import java.util.Scanner;
public class ch2_demo_4 {
    public static void main(String[] args) {
        double fee;
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入花费余额：");
        fee=sc.nextDouble();
        if(fee<10) {
            System.out.println("余额为"+fee+"，余额不足10元，请及时充值！");
        }
        else {
            System.out.println("余额为"+fee+",余额充足，请放心使用！");
        }

    }


}


