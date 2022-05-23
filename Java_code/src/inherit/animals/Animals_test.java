package inherit.animals;

public class Animals_test {
    public static void main(String[] args) {
        Pig pig =new Pig("peiqi",5, '男',4,100,50,26,"pink");
        System.out.println(pig);
        pig.eating("白菜");
        pig.walking();
    }
}
