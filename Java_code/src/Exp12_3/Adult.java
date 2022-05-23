package Exp12_3;

public abstract class Adult extends People {
    private final boolean marriage;
    private final String address;

    public Adult(String name, String sex, int age, boolean marriage, String address) {
        super(name, sex, age);
        this.marriage = marriage;
        this.address = address;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public String getAddress() {
        return address;
    }

    public void recreation() {
    }

}
