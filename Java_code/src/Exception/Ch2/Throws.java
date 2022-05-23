package Exception.Ch2;
import java.util.Scanner;
public class Throws {
    public static void main(String[] args) {
        try {
            method();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void method() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("please input a:");
        a= sc.nextInt();
        System.out.println("please input b:");
        b= sc.nextInt();
        if(b==0){
            throw new ArithmeticException();
        }
        else {
            System.out.println("c="+(double)a/b);
        }
    }
}
