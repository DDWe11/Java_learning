package Exception.Ch3;
import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Driver driver =new Driver();
            try {
                System.out.println("请输入驾驶员的酒精含量");
                driver.driving(sc.nextDouble());
            } catch (AlcoholException e) {
                e.printStackTrace();
                e.getMessage();
            }
    }
}

