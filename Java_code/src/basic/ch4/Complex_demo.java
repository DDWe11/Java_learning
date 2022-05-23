package basic.ch4;

public class Complex_demo {
    public static void main(String[] args) {

        System.out.println("请输入第一个复数的实部和虚部(fz):");
        Complex first = new Complex();
        System.out.println("请输入第二个复数的实部和虚部(fm):");
        Complex second = new Complex();

        Complex result_Add = first.CAdd(second);                    //是第一个对第二个的操作
        Complex result_Reduce = first.CSub(second);
        Complex result_Multiply = first.CMul(second);
        Complex result_Divide = first.CDiv(second);

        System.out.println("两个复数相加后:");
        result_Add.printf();
        System.out.println("两个复数相减后:");
        result_Reduce.printf();
        System.out.println("两个复数相乘后:");
        result_Multiply.printf();
        System.out.println("两个复数相除后:");
        result_Divide.printf();
    }
}
