package Cola;

public class SalesEmployee extends ColaEmployee{
    private double monSales;
    private double rate;

    public SalesEmployee(String name, int birth_month, double monSales, double rate) {
        super(name, birth_month);
        this.monSales = monSales;
        this.rate = rate;
    }

    @Override
    public double getSalary(int month) {
        if(month==super.getBirth_month()){
            return (monSales*rate)+100;
        }
        return monSales*rate;
    }
}
