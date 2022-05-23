package basic.ch3;

import java.util.Arrays;
import java.util.Scanner;

public class ch3_demo_2 {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入数组的长度：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数据： ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr = clearRepeat(arr);
        System.out.println("新数组：" + Arrays.toString(arr));
    }

    public static int[] clearRepeat(int[] arr) {
        int count = 0;//记录重复元素个数；
        //计算重复元素个数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        int newLength = arr.length - count;//创建新的数组
        int[] newArr = new int[newLength];
        int index = 0;
        //把旧数组的元素放进新数组中
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean flag = false;

            for (int k : newArr) {
                if (k == temp) {
                    flag = true;//数组重复
                    break;
                }
            }
            if (!flag) { //如果不重复就放进新数组中
                newArr[index++] = temp;
            }
        }
        return newArr;
    }
}
