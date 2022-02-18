package ee.itcollage.level3;

import static java.lang.Math.abs;

public class AbsoluteNumber {

    //todo add tests for this class
    public static int makeAbsolute(int x1){
        return abs(x1);
    }


    public static void main(String[] args) {
        //check if works ->
        System.out.println(makeAbsolute(-2));// same situation inside the class i can call the method

    }

}
