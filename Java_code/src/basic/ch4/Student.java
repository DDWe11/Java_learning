package basic.ch4;

public class Student {
    private String name;
    private int age;
    private double data_structure;
    private double English;

    //数据封装
    public String getterName() {
        return name;
    }

    public void setterName(String name) {
        this.name = name;
    }

    public int getterAge() {
        return age;
    }

    public void setterAge(int age) {
        this.age = age;
    }

    public double getterDS() {
        return data_structure;
    }

    public void setterDS(double data_structure) {
        this.data_structure = data_structure;
    }

    public double getterEnglish() {
        return English;
    }

    public void setterEnglish(double English) {
        this.English = English;
    }

    //计算总分total（)
    public double total() {
        double total = getterDS() + getterEnglish();
        return total;
    }

    //计算平均分average()
    public double average() {
        double average = total() / 2.0;
        return average;
    }

    public void printStudent() {
        System.out.println("Name:" + getterName());
        System.out.println("Age:" + getterAge());
        System.out.println("DS scores :" + getterDS());
        System.out.println("English scores :" + getterEnglish());
        System.out.println("TOTAL: " + total());
        System.out.println("AVERAGE: " + average());
    }
}
