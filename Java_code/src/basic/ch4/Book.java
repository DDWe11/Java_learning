package basic.ch4;

public class Book {
    private String Book_name;
    private String Publish;
    private String[] writers;
    private double Price;
    private int Pages;

    //Assignment
    public void setBook_name(String book_name) {
        this.Book_name = book_name;
    }

    public void setPublish(String publish) {
        this.Publish = publish;
    }

    public void setWriters(String[] writers1) {
        this.writers = writers1;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setPages(int pages) {
        this.Pages = pages;
    }

    //function
    public void Print() {
        System.out.println("书名：" + "《" + this.Book_name + "》");
        System.out.println("出版社名：" + this.Publish);
        System.out.print("作者：");
        for (int i = 0; i < writers.length; i++) {
            System.out.println(writers[i] + " ");
        }
        System.out.println("价格：" + this.Price);
        System.out.println("页数：" + this.Pages);
    }

    public void MakeNote(String note) {
        System.out.println("笔记内容是/" + note + "/");
    }
}
