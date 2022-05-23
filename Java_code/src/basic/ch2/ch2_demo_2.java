//产生若干不大于100的随机整数aInt，进行如下处理：
//        (1) 如果50≤aInt≤60则重新产生随机整数;
//        (2) 如果aInt被7整除则停止产生随机数，退出程序；
//        (3) 如果aInt是奇数，计算s=1+1/2+……+1/aInt；
//        (4) 如果aInt是偶数，输出该偶数的所有因子。
package basic.ch2;

import java.util.Random;

public class ch2_demo_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int aInt;
        double s = 0;
        int m = 0, k = 0;
        aInt = rand.nextInt(100);
        System.out.println(+aInt);
        if (50 <= aInt && aInt <= 60) {
            aInt = rand.nextInt(100);
            System.out.println(+aInt);
        }
        if (aInt % 7 == 0) {
            System.exit(0);
        }
        if (aInt % 2 == 1) {
            for (int i = 1; i <= aInt; i++) {
                s += 1.0 / i;
            }
            System.out.printf("%.3f", s);
        }
        if (aInt % 2 == 0) {
            for (int j = 1; j <= aInt / 2; j++) {
                if (aInt % j == 0) {
                    m = aInt / j;
                    System.out.print("因子有：" + m + "\t");
                }
                if (m % 2 == 0) {
                    k++;
                }
            }
            System.out.println("一共有：" + k);
        }
    }
}
