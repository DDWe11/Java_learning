package basic.ch4;

import java.util.Scanner;

public class Student_demo {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the student's name: ");
        stu.setterName(sc.next());

        System.out.println("Please input the student's age: ");
        stu.setterAge(sc.nextInt());

        System.out.println("Please input the student's data_structure scores: ");
        stu.setterDS(sc.nextDouble());

        System.out.println("Please input the student's English scores: ");
        stu.setterEnglish(sc.nextDouble());

        System.out.println();
        stu.printStudent();
    }
}
