package Cola;

public class hourlyEmployee extends ColaEmployee{
    private double Salary_hourly;
    private int workhours;

    public hourlyEmployee(String name, int birth_month, double salary_hourly, int workhours) {
        super(name, birth_month);
        Salary_hourly = salary_hourly;
        this.workhours = workhours;
    }

    @Override
    public double getSalary(int month) {
        double Salary = 0;
        if(workhours>=160){
            Salary=(workhours-160)*1.5*Salary_hourly+160*Salary_hourly;
        }
        else {
            Salary=workhours*Salary_hourly;
        }
        if(month==super.getBirth_month()){
            return Salary+100;
        }
        return Salary;
    }
}
