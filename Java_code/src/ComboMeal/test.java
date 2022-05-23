package ComboMeal;

public class test {
    public static void main(String[] args) {
        CheeseBurger CB = new CheeseBurger(5, 15);
        Cola CL = new Cola(500, 8);
        FrenchFires FF = new FrenchFires("large", 8);
        CheeseBurgerComboMeal CBCM = new CheeseBurgerComboMeal(22, CB, CL, FF);
        CBCM.showMessage();
    }
}

