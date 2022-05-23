package basic.ch4;

public class Cuboid {
    private double length;
    private double width;
    private double height;

    //构造公共空方法
    public Cuboid() {

    }

    //初始化所有成员变量方法
    public Cuboid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //逐个封装
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 10;
            System.out.println("输入违法，请输入大于0的数，length默认值为10，请重新输入！");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 20;
            System.out.println("输入违法，请输入大于0的数，width默认值为20，请重新输入！");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 30;
            System.out.println("输入违法，请输入大于0的数，height默认值为30，请重新输入！");
        }
    }

    //定义计算表面积getArea（）
    public double getArea() {
        double area = 2 * (this.height * this.width + this.height * this.length + this.length * this.width);
        return area;
    }

    //定义计算体积getCubage（）
    public double gerCubage() {
        double volume = this.height * this.width * this.length;
        return volume;
    }

    //判断是否正方体isCube（）
    public boolean isCube() {
        if ((this.length == this.width) && (this.height == length)) {
            return true;
        }
        return false;
    }

    //输出长方体长宽高数据printCuboid()
    public void printCuboid() {
        System.out.println("length= " + this.length);
        System.out.println("width= " + this.width);
        System.out.println("height= " + this.height);
    }

    //绘制该长方体drawing()
    public void drawing() {
        System.out.println("正在绘制长方体...");
    }

}
