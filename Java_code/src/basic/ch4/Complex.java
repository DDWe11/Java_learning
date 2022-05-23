package basic.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Complex {
    private double RealPart;
    private double ImaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.RealPart = realPart;
        this.ImaginaryPart = imaginaryPart;
    }

    public void Complex(double realPart, double imaginaryPart) {
        this.RealPart = realPart;
        this.ImaginaryPart = imaginaryPart;
    }

    Complex() {
        Scanner sc = new Scanner(System.in);
        double RealPart=sc.nextDouble();
        double ImaginaryPart=sc.nextDouble();
        Complex(RealPart, ImaginaryPart);
    }

    public double getRealPart() {
        return RealPart;
    }

    public double getImaginaryPart() {
        return ImaginaryPart;
    }

    //Add
    public Complex CAdd(Complex a) {
        double RealPart1 = a.getRealPart();
        double ImaginaryPart1 = a.getImaginaryPart();
        double newRealPart = RealPart + RealPart1;
        double newImaginaryPart = ImaginaryPart + ImaginaryPart1;
        Complex result = new Complex(newRealPart, newImaginaryPart);
        return result;
    }

    //Sub
    public Complex CSub(Complex a) {
        double RealPart1 = a.getRealPart();
        double ImaginaryPart1 = a.getImaginaryPart();
        double newRealPart = RealPart - RealPart1;
        double newImaginaryPart = ImaginaryPart - ImaginaryPart1;
        Complex result = new Complex(newRealPart, newImaginaryPart);
        return result;
    }

    //Mul
    public Complex CMul(Complex a) {
        double RealPart1=a.getRealPart();
        double ImaginaryPart1=a.getImaginaryPart();
        double newRealPart = RealPart*RealPart1-ImaginaryPart*ImaginaryPart1;
        double newImaginaryPart = RealPart*ImaginaryPart1+ImaginaryPart*RealPart1;
        Complex result = new Complex(newRealPart,newImaginaryPart);
        return result;
    }

    //Div
    public Complex CDiv(Complex a) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double RealPart1=a.getRealPart();
        double ImaginaryPart1=a.getImaginaryPart();
        double newRealPart = (RealPart*RealPart1+ImaginaryPart*ImaginaryPart1)
                / (RealPart1*RealPart1+ImaginaryPart1*ImaginaryPart1);
        double newImaginaryPart = (ImaginaryPart*RealPart1-RealPart*ImaginaryPart1)
                /(RealPart1*RealPart1+ImaginaryPart1*ImaginaryPart1);
        newRealPart= Double.parseDouble(df.format(newRealPart));
        newImaginaryPart= Double.parseDouble(df.format(newImaginaryPart));
        Complex result = new Complex(newRealPart,newImaginaryPart);
        return result;
    }

    public void printf() {                                                    //输出结果
        System.out.println(  RealPart + " + " +  ImaginaryPart + "i");
    }

}
