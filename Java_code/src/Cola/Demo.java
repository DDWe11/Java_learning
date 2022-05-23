package Cola;

public class Demo {
    public static void main(String[] args) {
        ColaEmployee[] col = {
                new SalariedEmployee("salariedEmployee", 7, 30000),//name,month,月薪
                new hourlyEmployee("hourlyEmployee", 9, 190, 300),//name,month,时薪,小时数
                new SalesEmployee("salesEmployee", 10, 1000000, 0.15)//name,month,月销售额，提成率
        };
        //数组遍历
        for (int i = 0; i < col.length; i++) {
            new Company().getSalary(col[i], 9);
        }
    }
}

