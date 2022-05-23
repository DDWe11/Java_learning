package basic.ch4;

/*1.设计一个线段类，每一个线段用两个端点的坐标表示，类中定义计算线段长度的方法、
对线段进行平移的方法和对线段绕原点旋转的方法。定义线段类对象并进行相应的操作。
 */
public class Line {
    private float x1, x2, y1, y2;

    public Line(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //计算长度
    public float LineLength() {
        float p = (x1 - x2) * (x1 - x2);
        float q = (y1 - y2) * (y1 - y2);
        return (float) Math.sqrt(p + q);
    }

    //平移
    public void Move(float x, float y) {
        x1 += x;
        x2 += x;
        y1 += y;
        y2 += y;
    }

    //旋转
    public void Rotate() {
        x1 = -x1;
        x2 = -x2;
        y1 = -y1;
        y2 = -y2;
    }

    @Override
    public String toString() {
        return ("Line[x1=" + x1 + ",y1=" + y1 + ",x2=" + x2 + ",y2=" + y2 + "]");
    }
}
