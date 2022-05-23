package basic.ch4;

/*设计一个自然数类，该类的对象能表示一个自然数。
类中定义方法能计算1到这个自然数的各个数之和、能够判断该自然数是否是素数。
定义自然数的对象并进行相应的操作。*/
public class Number {
    private int num;

    //输入
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //累加
    public int Cumulation() {
        int sum = 0;
        for (int i = 0; i <= this.num; i++) {
            sum += i;
        }
        return sum;
    }

    //判断素数
    public void isprime() {
        int n, s;
        int f = 0;
        s = (int) Math.sqrt(this.num);
        for (n = 2; n <= s; n++) {
            if (this.num % n == 0) {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println(this.num + "是素数");
        }
        if (f == 1) {
            System.out.println(this.num + "不是素数");
        }

    }
}
