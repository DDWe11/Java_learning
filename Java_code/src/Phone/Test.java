package Phone;

public class Test {
    public static void main(String[] args) {
        Mainboard mainboard =new Mainboard("A15",2000);
        Screen screen=new Screen("Sasumg",3000);
        Phone phone =new Phone("Apple",mainboard,screen);
        phone.showMessage();
    }
}
