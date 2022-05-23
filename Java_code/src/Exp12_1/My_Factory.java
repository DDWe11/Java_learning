package Exp12_1;

public class My_Factory {
    public static Equipment getInstance(String equipmentName){
        if(equipmentName.equals("Fan")){
            return new Fan("Meidi_Fan",100);
        }
        else if(equipmentName.equals("Refrigerator"))
            return new Refrigerator("Geli_Refrigerator",200);
        else
            return null;
    }
}
