package Exp9_1;
/*定义Hand类，要求如下：(1)私有成员变量包括手指长度length，手掌面积area和握力grip；(2)定义构造方法初始化所有成员变量;
(3)省略setter和getter方法；(4)功能方法包括：catching(String thing)方法抓东西，getInfo()方法取得Hand的所有信息。
 */
public class Hand {
    private double length;
    private double area;
    private double grip;

    public Hand(double length, double area, double grip) {
        this.length = length;
        this.area = area;
        this.grip = grip;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGrip() {
        return grip;
    }

    public void setGrip(double grip) {
        this.grip = grip;
    }

    public String catching(String thing){
       return "抓住了"+thing;
    }
    public void getInfo(){
        System.out.println("Hand{" +
                "length=" + length +
                ", area=" + area +
                ", grip=" + grip +
                '}');
    }

}
