package Exp12_3;

public class Demo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("张仲景", "男", 56, true, "东汉南阳涅阳县",
                "五禽戏", 360000, "天津城建大学附属医院");
        System.out.println(doctor);
        doctor.eating("白开水");
        doctor.recreation();
        doctor.working();
    }
}
