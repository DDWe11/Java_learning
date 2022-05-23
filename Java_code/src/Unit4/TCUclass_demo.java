package Unit4;

import java.util.Scanner;

public class TCUclass_demo {
    public static void main(String[] args) {
        TCUclass[] tcuclass = new TCUclass[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< tcuclass.length;i++){
            tcuclass[i]=new TCUclass();
            System.out.println("请输入班级号：");
            tcuclass[i].setClassID(sc.next());
            System.out.println("请输入班级口号");
            tcuclass[i].setSlogan(sc.next());
        }
        for (TCUclass r : tcuclass) {
            System.out.println("计算机" + r.getClassID()+ "班: "
                    + r.getSlogan());
        }
    }
}
