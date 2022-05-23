package Exp9_2;
/*(1)成员变量包括学号studentID,班级className，成绩score，学校名schoolName是public static成员
(2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；
(3) 省略setter和getter方法；
(4)功能方法包括：重写Object中的toString()方法返回有意义的Student对象信息，
定义实体方法takeLesson(String course)表示学生选修了一门课程，重写父类working(String information)方法表示学生正在学习某个内容。
 */

public class Student extends Person{
    private int studentId;
    private String className;
    private double score;
    public static String schoolName="TCU";

    public Student() {
    }

    public Student(int id, String name, String sex, String birthday, int studentId, String className, double score) {
        super(id, name, sex, birthday);
        this.studentId = studentId;
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", className='" + className + '\'' +
                ", score=" + score +
                " " + super.toString();
    }
    public void takeLesson(String course){
        System.out.println("学生"+this.name+"选修了"+course);
    }
    @Override
    public void working(String information){
        System.out.println("学生"+this.name+"在学习"+information);
    }
}

