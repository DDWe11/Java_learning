package Cola;

public abstract class ColaEmployee {
    private String Name;
    private int Birth_month;
    private double Salary;

    public ColaEmployee(String name, int birth_month) {
        Name = name;
        Birth_month = birth_month;
    }

    public ColaEmployee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBirth_month() {
        return Birth_month;
    }

    public void setBirth_month(int birth_month) {
        Birth_month = birth_month;
    }

    public abstract double getSalary(int month);

}
