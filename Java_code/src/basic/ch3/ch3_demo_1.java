package basic.ch3;

import java.util.Scanner;
import java.util.Arrays;

public class ch3_demo_1 {
    public static void main(String[] args) {
        int [] a= new int[7];
        int i,t,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字，用空格分开：");
        for(i=0;i<a.length;i++) {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("输出排序后的结构:");
        System.out.println(Arrays.toString(a));
    }
}
