package Exp9_2;
/*(1)成员变量包括身份证号id，姓名name,性别sex，出生日期birthday，国籍nationality是public static成员变量；
(2)构造方法包括一个空构造方法，一个能够初始化所有成员变量的构造方法；
(3)省略setter和getter方法；
(4)功能方法包括：实体方法saying(Person  per, String msg)表示向per对象说了一句话，
重写Object中的toString()方法返回Person对象有意义的信息，抽象方法working(String information)表示某人在工作。
 */
abstract public class Person {
    protected int id;
    protected String name;
    protected String sex;
    protected String birthday;
    protected static String nationality="China";

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
    public String saying(Person per,String msg){
        return "To "+per.name+" say "+msg;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
    abstract public void working(String information);
}
