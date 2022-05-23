package Exp9_2;
/*(1)成员变量包括教师工号teacherID,部门department，工资salary，学校名schoolName是public static成员；
(2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；
(3) 省略setter和getter方法；
(4)功能方法包括：重写Object中的toString()方法返回有意义的Teacher对象信息，
定义实体方法teaching(Student student,String course)表示为学生授课，重写父类working(String information)方法表示老师正在准备课程。
 */

public class Teacher extends Person{
    private int teacherID;
    private String department;
    private double salary;
    public static String schoolName="TCU";

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday, int teacherID, String department, double salary) {
        super(id, name, sex, birthday);
        this.teacherID = teacherID;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                " " + super.toString();
    }

    @Override
    public void working(String information) {
        System.out.println("老师"+this.name+"正准备课程"+information);
    }
    public void teaching(Student student,String course){
        System.out.println("老师"+this.name+"正在为学生"+student.name+"授课"+course);
    }
}
