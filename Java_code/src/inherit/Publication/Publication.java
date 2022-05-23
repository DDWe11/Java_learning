package inherit.Publication;

public class Publication {
    private String name;
    private String ISBN_NO;
    private double price;

    public Publication(String name, String ISBN_NO, double price) {
        this.name = name;
        this.ISBN_NO = ISBN_NO;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getISBN_NO() {
        return ISBN_NO;
    }

    public double getPrice() {
        return price;
    }

    public void showMessage(){

    }
}
