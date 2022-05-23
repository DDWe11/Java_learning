package Unit4;

public class Room {
   private String id;
   private double area;
   private String type;
   private double price;
   private boolean state;

    public Room() {
    }

    public Room(String id, double area, double price) {
        this.id = id;
        this.area = area;
        this.price = price;
    }

    public Room(String id, double area, String type, double price, boolean state) {
        this.id = id;
        this.area = area;
        this.type = type;
        this.price = price;
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getArea(){
        return area;
    }
    //function

    public double getMoney(){
        double Total=this.area*this.price;
        return Total;
    }
    public void showRoom(){
        System.out.println("编号ID:"+this.id+" "+"面积:"+this.area+" "
                +"户型:"+this.type+" "+"单价:"+this.price+" "+"销售状态:"+this.state+" "
                +"总价:"+this.getMoney());
    }


}
