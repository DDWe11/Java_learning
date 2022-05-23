package Exp9_1;
/*(1)私有成员变量包括身份证号码id,姓名name，年龄age和手hand;(2)定义一个空构造方法，另一个构造方法初始化所有成员变量；
(3)定义getName()方法返回人的姓名;(4)功能方法包括：showPerson()方法显示某人的所有信息；
(2)saying(Person per,String msg)方法表示一个人对另一个人说了一些信息msg;
(3)getSomething(String something)表示用手拿东西，需要调用Hand对象的拿方法catching();
(4)start(Car car)方法表示某人启动了一台汽车，需要调用Car的starting方法启动发动机。
 */
public class Person {
    private String id;
    private String name;
    private int age;
    private Hand hand;

    public Person() {
    }

    public Person(String id, String name, int age, Hand hand) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hand = new Hand(hand.getLength(), hand.getArea(), hand.getGrip());
    }

    public String getName() {
        return name;
    }
    public void showPerson(){
        System.out.println("Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hand=" + hand +
                '}');
    }
    public void saying(Person per,String msg){
        System.out.println(this.getName()+"对"+per.name+"说:"+msg);
    }
    public String  getSomething(String something){
        return this.name+hand.catching(something);
    }
    public String start(Car car){
        return this.name+car.starting();
    }
}
