package Exp9_1;
/*(1)创建一台汽车，品牌是红旗L5，排气量是3.0，价格是25万；(2)创建一只手，手指长度8厘米,手掌面积42平方厘米，握力是45kg；
(3)创建Person对象孙悟空和猪八戒，孙悟空向猪八戒说“八戒，你这个呆子！”，孙悟空拿了一根金箍棒并启动了一辆红旗L5汽车。
 */
public class Demo {
    public static void main(String[] args) {
        Car car =new Car("红旗L5",3.0,250000.0);
        Hand hand =new Hand(8.0,42.0,45.0);
        Person pig =new Person("2003924","猪八戒",12,hand);
        Person monkey =new Person("20020714","孙悟空",11,hand);

        monkey.saying(pig,"八戒，你个呆子！");

        System.out.println(monkey.getSomething("金箍棒"));
        System.out.println(monkey.start(car));
    }
}
