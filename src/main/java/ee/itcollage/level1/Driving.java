package ee.itcollage.level1;

public class Driving {

    public static void main(String[] args) {
        //todo find a way to call methods from your ferrari
        Ferrari testarrosa = new Ferrari();
        testarrosa.drift();//
        // create new methods
        Ferrari ferrari = new Ferrari();
        ferrari.setColor("red");
        System.out.println("what is the color of the car?");
        System.out.println(ferrari.getColor());

    }
}
