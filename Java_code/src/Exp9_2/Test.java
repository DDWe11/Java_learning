package Exp9_2;

public class Test {
    public static void main(String[] args) {
        Student swk = new Student(54188,"孙悟空","male","2000.7.11",
                2107120211,"体育课",88.7);
        System.out.println(swk.toString());
        swk.takeLesson("体育课");
        swk.working("体育");
        Teacher ptlz =new Teacher(54199,"菩提老祖","male","1000.12.11",
                2107120210,"体育组",8999);
        System.out.println(ptlz.toString());
        ptlz.teaching(swk,"体育课");
        ptlz.working("体育");
    }
}
