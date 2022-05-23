package inherit.Publication;

public class Books extends Publication{
    private double bookSize;
    private int bookPages;

    public Books(String name, String ISBN_NO, double price, double bookSize, int bookPages) {
        super(name, ISBN_NO, price);
        this.bookSize = bookSize;
        this.bookPages = bookPages;
    }
    public void showMessage(){
        System.out.println("书本信息：");
        System.out.println("名称："+getName()+";    ISBN_NO: "+getISBN_NO()+";    价格："+getPrice()+"元");
        System.out.println("大小："+this.bookSize+"寸;    页码："+this.bookPages+"页");
    }

}
