package basic.ch3;

public class ch3_demo_4 {
    public static void main(String[] args) {
        double[][] arr = {{62, 59, 82, 0}, {76, 86, 68, 0}, {58, 71, 79, 0}, {45, 67, 76, 0}};
        int n = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length - 1; j++) {
                sum += arr[i][j];
            }
            arr[i][3] = sum / 3.0;
        }
        System.out.println("\n\t课程学号\t数学\t计算机基础\t大学语文\t平均分\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\t%d\t", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
