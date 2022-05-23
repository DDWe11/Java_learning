package inherit.animals;

public class Animals {
    protected String name;
    protected int age;
    protected char sex;
    protected int legnum;
    protected double weight;

    public Animals() {
    }

    public Animals(String name, int age, char sex, int legnum, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.legnum = legnum;
        this.weight = weight;
    }
    protected void eating(String food){
        System.out.println(name+"  is eating "+food);
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", legnum=" +
                legnum + ", weight=" + weight + '}';
    }
}
