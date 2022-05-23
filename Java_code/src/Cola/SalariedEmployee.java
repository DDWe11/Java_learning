package Cola;

public class SalariedEmployee extends ColaEmployee {
    private double Salary;
    public SalariedEmployee(String name, int birth_month, double salary) {
        super(name, birth_month);
        Salary = salary;
    }

    @Override
    public double getSalary(int month) {
        if(month==super.getBirth_month()){
            return Salary+100;
        }
        else {
            return Salary;
        }
    }
}
