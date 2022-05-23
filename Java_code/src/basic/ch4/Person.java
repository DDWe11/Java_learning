package basic.ch4;

public class Person {
    String id_code;
    String name;
    String sex;
    int age;
    String native_place;
    String address;

    public void eating(String food) {
        System.out.println(name + "正在吃" + food);
    }

    public void shopping(String goods) {
        System.out.println("要购买的商品: " + goods);
    }

    public void sleeping(int time) {
        System.out.println("睡觉的时间: " + time + "小时");
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public void printPerson() {
        System.out.println("id: " + id_code);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age + "岁");
        System.out.println("籍贯：" + native_place);
        System.out.println("地址：" + address);
    }
}
