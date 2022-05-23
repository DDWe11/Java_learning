package Exception.Ch2;

import java.util.Scanner;
public class Try_Catch_final {
    public static void main(String[] args) {
        int a,b;

        Scanner sc =new Scanner(System.in);

        System.out.println("请输入a，b");
        a=sc.nextInt();
        b=sc.nextInt();

        double c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("错误信息/"+e.getMessage());
            System.out.println("请重新输入b的值");
            b= sc.nextInt();
            c=(double) a/b;
//            System.out.println("c="+a/b);
        }
        System.out.println("c="+c);
    }
}
