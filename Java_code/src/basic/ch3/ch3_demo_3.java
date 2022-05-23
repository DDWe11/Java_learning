package basic.ch3;

import java.util.Arrays;
import java.util.Scanner;

public class ch3_demo_3 {
    public static int[] LenArr(int[] Arr, int len) {
        int[] a = new int[len];
        int b = 0;
        for (int i = 10 - len; i < 10; i++) {
            a[b] = Arr[i];
            b++;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入显示的位数(1-10)：");
        len = sc.nextInt();
        System.out.println(Arrays.toString(LenArr(Arr, len)));
    }
}

