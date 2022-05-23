package basic.ch1;

import java.util.Scanner;

public class ch1_demo_3 {
    public static void main(String[] args) {
        float scores = 0;
        int nums = 0;
        float average = 0;
        System.out.println("Please input the scores:");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextFloat()) {
            scores = sc.nextFloat();
            average += scores;
            nums += 1;
        }
        average = average / nums;
        System.out.println("The average is " + average);
    }
}
