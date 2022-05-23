package Unit4;

import java.text.DecimalFormat;

public class Room_demo {
    public static void main(String[] args) {
        double TotalPrice = 0, TotalArea = 0;
        Room room[] = new Room[3];
        room[0]=new Room("3-2-502",113.5,"三室一厅",15000,false);
        room[1]=new Room("4-5-1108",156.9,"四室两厅",17500,true);
        room[2]=new Room("4-3-1501",45.9,"两室一厅",16200,true);

        for (Room r : room) {
            TotalPrice += r.getMoney();
            TotalArea += r.getArea();
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("房子的总面积为："+ df.format(TotalArea)+"平方米");
        System.out.println("房子的总价格为："+df.format(TotalPrice)+"元");
        room[0].setState(true);
        for(Room r:room){
            r.showRoom();
        }

    }
}
