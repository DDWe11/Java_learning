package Phone;

public class Phone {
    private String brand;
    private Mainboard mainboard;
    private Screen screen;

    public Phone(String brand, Mainboard mainboard, Screen screen) {
        this.brand = brand;
        this.mainboard = mainboard;
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }
    public void showMessage(){
        System.out.println("手机品牌:"+this.brand+"  价格："+(this.mainboard.getPrice()+this.screen.getPrice()));
        System.out.println("主板品牌:"+this.mainboard.getBrand()+"  主板价格:"+this.mainboard.getPrice());
        System.out.println("屏幕品牌:"+this.screen.getBrand()+"  屏幕价格:"+this.screen.getPrice());


    }
}
