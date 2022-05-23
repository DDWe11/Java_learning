package Exception.Ch3;

public class AlcoholException extends Exception{
    private Driver driver;
    private double alcoholicity;
    private static final double level = 500;

    public AlcoholException() {
    }

    public AlcoholException(Driver driver, double alcoholicity) {
        this.driver = driver;
        this.alcoholicity = alcoholicity;
    }

    @Override
    public String getMessage() {
        return "AlcoholException{" +"level:"+level+
                "  driver: "+ "alcoholicity:" + alcoholicity +
                "} " + "So you are DUI}";
    }
}

