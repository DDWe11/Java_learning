package basic.ch2;
import java.util.Arrays;
public class ch2_demo_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long startTime=System.currentTimeMillis();
        int []arr= {5,3,2,7,1};
        int t;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        long endTime=System.currentTimeMillis();
        System.out.println("程序运行的时间："+(endTime-startTime)/1000.0+"秒");
    }
}

