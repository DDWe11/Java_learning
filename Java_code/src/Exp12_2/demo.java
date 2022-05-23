package Exp12_2;

public class demo {
    public static void main(String[] args) {
        Lion lion =new Lion(56,0.6,"yellow",38,1.2);
        System.out.println(lion.toString());
        lion.walking();
        lion.eating("mermer");
    }
}
