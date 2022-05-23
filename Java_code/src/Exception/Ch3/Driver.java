package Exception.Ch3;

public class Driver {
    private static final double level = 500;
    public void driving(double alcohocity) throws AlcoholException{
        if(alcohocity>level){
            throw new AlcoholException(this,alcohocity);
        }
        System.out.println("Congratulations,you aren't DUI");
    }
}
