package ComboMeal;

public class CheeseBurgerComboMeal {
    private double price;
    private CheeseBurger cb ;
    private Cola co;
    private FrenchFires fc;

    public CheeseBurgerComboMeal(double price, CheeseBurger cb, Cola co, FrenchFires fc) {
        this.price = price;
        this.cb = cb;
        this.co = co;
        this.fc = fc;
    }

    public double getPrice() {
        return price;
    }

    public void showMessage(){

        System.out.println("欢迎选择吉士汉堡套餐");
        System.out.println("吉士汉堡："+cb.getSize()+"寸；单价"+cb.getPrice()+"元;");
        System.out.println("可乐："+co.getVolume()+"ML, 单价"+co.getPrice()+"元;");
        System.out.println("薯条："+fc.getType()+", 单价"+fc.getPrice()+"元;");
        System.out.println("套餐优惠价格："+this.getPrice()+"元, 为您节省"+(this.cb.getPrice()+
                this.co.getPrice()+this.fc.getPrice()-this.getPrice())+"元;");
    }

}
