package ee.itcollage.level2;

public class Multiplication {
    private float result;

    static float opResult(float a, float b){
        float c = a * b;
        return c;
    }

    public static void main(String[] args) {
        //todo create function in this class that multiplies 2 inputs
        // call the function in the main method, for example with 5 and 4: 5x4 should be 20
        System.out.println(opResult(5,4)); // we are inside the class so i can call the method directly
    }
}
