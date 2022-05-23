package Exp12_3;

public class Doctor extends Adult implements IActivity {
    private final String specialty;
    private final double salary;
    private final String hospitalName;

    public Doctor(String name, String sex, int age, boolean marriage, String address, String specialty, double salary, String hospitalName) {
        super(name, sex, age, marriage, address);
        this.specialty = specialty;
        this.salary = salary;
        this.hospitalName = hospitalName;
    }

    @Override
    public void working() {
        System.out.println(this.getName() + "正在给病人看病！");
    }

    @Override
    public void recreation() {
        System.out.println(this.getName() + "的娱乐爱好是" + this.specialty);
    }

    @Override
    public void eating(String food) {
        super.eating(food);
    }

    @Override
    public String toString() {
        return "姓名：" + this.getName() + "  性别：" + this.getSex() + "  年龄：" + this.getAge() + "  婚姻：" + this.isMarriage()
                + "  住址：" + this.getAddress();
    }
}
