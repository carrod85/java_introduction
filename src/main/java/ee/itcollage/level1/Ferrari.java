package ee.itcollage.level1;

public class Ferrari {
    private String color;
    private String model;


    public void drive() {
        System.out.println("RRRRRRRRRRR");
    }

    public void stop() {
        System.out.println("EHEHEHEHEHEHE");
    }

    public void drift() {
        //todo add method body
        System.out.println("pssssssssssssss");
    }


    //todo create more methods

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.model = brand;
    }
    @Override
    public String toString() {
        return model;
    }
}