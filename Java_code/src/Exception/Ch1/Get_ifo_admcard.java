package Exception.Ch1;
/* 提取准考证号码包含的信息。(1)准考证号码是一串数字字符串，1-2位表示考场号，3-4位表示考室号，5-8位表示考生序号，
第9位表示考试类型（1表示A类，2表示B类，3表示C类）。例如一个准考证号码250323673表示的考场号是25,考室是03，
考生序号是2367，考试类型“C类”。(2)在准考证号码的最前面插入学校代码，把天津城建大学代码“10792”插入之后“10792250323673”。
 */
import java.util.Scanner;

public class Get_ifo_admcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        char quit = 'q';


        while (isTrue) {
            System.out.println("请输入考生准考证号（9位,输入q退出）：");
            String Card_id = sc.nextLine();
            if (Card_id.contains(quit + "")) {
                break;
            } else {
                while (Card_id.length() != 9) {

                    System.out.println("输入错误，请重新输入正确准考证号：");
                    Card_id = sc.nextLine();
                }
                System.out.println("考试信息如下：");
                System.out.print("考场号：" + Card_id.substring(0, 2) + ","
                        + "考试座位号：" + Card_id.charAt(3) + ","
                        + "考生号：" + Card_id.substring(5, 7) + ",");
                int isType = Integer.parseInt(Card_id.substring(8));
                if (isType == 1) {
                    System.out.print("考试类型'A'");
                }
                if (isType == 2) {
                    System.out.print("考试类型'B'");
                }
                if (isType == 3) {
                    System.out.print("考试类型'C'");
                }
                StringBuilder id = new StringBuilder(Card_id);
                System.out.println(",考生证件号：" + id.insert(0, "10792"));
            }
            System.out.println();
        }
    }
}

